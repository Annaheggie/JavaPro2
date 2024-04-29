package Homework5;

import java.util.List;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to count occurrences: ");
        String wordToCount = scanner.next();

        List<String> wordList = List.of("apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon", "mango", "nectarine", "orange", "papaya", "quince", "raspberry", "strawberry", "tangerine", "ugli", "watermelon");

        WordCounterHelper counterHelper = new WordCounterHelper();
        int occurrences = counterHelper.countOccurrence(wordList, wordToCount);

        System.out.println("The word '" + wordToCount + "' occurs " + occurrences + " times.");
    }
}

class WordCounterHelper {
    public int countOccurrence(List<String> wordList, String wordToCount) {
        int count = 0;
        for (String word : wordList) {
            if (word.equalsIgnoreCase(wordToCount)) {
                count++;
            }
        }
        return count;
    }
}

