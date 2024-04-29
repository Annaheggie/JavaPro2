package Homework4;

import java.util.Scanner;
import java.util.Random;

public class WordGuessingGame {
    private static final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String guessedWord = words[random.nextInt(words.length)];
        String playerAnswer;

        do {
            System.out.print("Guess the word: ");
            playerAnswer = scanner.next();

            if (guessedWord.equals(playerAnswer)) {
                System.out.println("Congratulations! You guessed the word.");
            } else {
                for (int i = 0; i < 15; i++) {
                    if (i < guessedWord.length() && i < playerAnswer.length() && guessedWord.charAt(i) == playerAnswer.charAt(i)) {
                        System.out.print(guessedWord.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
        } while (!guessedWord.equals(playerAnswer));

        scanner.close();
    }
}

