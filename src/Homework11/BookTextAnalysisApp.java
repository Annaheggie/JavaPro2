package Homework11;

import java.nio.file.Path;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class BookTextAnalysisApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Book Text Analysis App!");

        System.out.print("Enter the title of the book to analyze: ");
        String bookTitle = scanner.nextLine();

        Path bookPath = Paths.get("src/" + bookTitle + ".txt");

        if (!Files.exists(bookPath)) {
            System.out.println("The book is missing in the project directory.");
        } else {
            try (InputStream inputStream = new FileInputStream(bookPath.toFile());
                 Scanner fileScanner = new Scanner(inputStream)) {

                Map<String, Integer> wordFrequency = new HashMap<>();
                int totalUniqueWords = 0;

                while (fileScanner.hasNext()) {
                    String word = fileScanner.next().toLowerCase().replaceAll("[^a-zA-Z]", "");
                    if (word.length() > 2) {
                        wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                        totalUniqueWords++;
                    }
                }
                BookAnalyzer bookAnalyzer = new BookAnalyzer();
                bookAnalyzer.analyzeBook(bookTitle);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}