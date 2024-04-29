package Homework5;

import java.util.*;

public class WordOccurrenceCalculator {
    public static void main(String[] args) {
        List<String> wordsList = Arrays.asList("bird", "fox", "cat", "bird", "dog", "cat", "bird", "elephant", "cat", "bird");

        // Calculate and output word occurrences
        calcOccurrence(wordsList);

        // Find and return word occurrences as a list of structures
        List<WordOccurrence> occurrences = findOccurrence(wordsList);
        System.out.println(occurrences);
    }

    public static void calcOccurrence(List<String> wordsList) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : wordsList) {
            wordCount.put(word.toLowerCase(), wordCount.getOrDefault(word.toLowerCase(), 0) + 1);
        }
        wordCount.forEach((word, count) -> System.out.println(word + ": " + count));
    }

    public static List<WordOccurrence> findOccurrence(List<String> wordsList) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : wordsList) {
            wordCount.put(word.toLowerCase(), wordCount.getOrDefault(word.toLowerCase(), 0) + 1);
        }

        List<WordOccurrence> occurrences = new ArrayList<>();
        wordCount.forEach((word, count) -> occurrences.add(new WordOccurrence(word, count)));

        return occurrences;
    }
}

class WordOccurrence {
    String name;
    int occurrence;

    public WordOccurrence(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "{name: \"" + name + "\", occurrence: " + occurrence + "}";
    }
}
