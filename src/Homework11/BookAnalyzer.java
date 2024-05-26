package Homework11;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class BookAnalyzer {
    public void analyzeBook(String bookTitle) {
        String bookPath = "src/" + bookTitle + ".txt";

        File bookFile = new File(bookPath);
        if (!bookFile.exists()) {
            System.out.println("Book not found in the directory.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(bookFile))) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }

            String[] words = content.toString().toLowerCase().split("\\W+");
            Map<String, Integer> wordFrequency = new HashMap<>();
            for (String word : words) {
                if (word.length() > 2) {
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                }
            }

            List<Map.Entry<String, Integer>> popularWords = wordFrequency.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(10)
                    .collect(Collectors.toList());

            int totalUniqueWords = wordFrequency.size();

            writeStatisticsToFile(bookTitle, wordFrequency, totalUniqueWords);

            displayStatistics(popularWords, totalUniqueWords);
        } catch (IOException e) {
            System.out.println("Error reading the book file.");
        }
    }

    private void writeStatisticsToFile(String bookTitle, Map<String, Integer> wordFrequency, int totalUniqueWords) {
        String outputFileName = bookTitle + "_statistic.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                writer.write(entry.getKey() + " -> " + entry.getValue() + "\n");
            }
            writer.write("Total Unique Words: " + totalUniqueWords);
        } catch (IOException e) {
            System.out.println("Error writing statistics to file.");
        }
    }

    private void displayStatistics(List<Map.Entry<String, Integer>> popularWords, int totalUniqueWords) {
        System.out.println("Top 10 Popular Words:");
        for (Map.Entry<String, Integer> entry : popularWords) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("Total Unique Words: " + totalUniqueWords);
    }
}
