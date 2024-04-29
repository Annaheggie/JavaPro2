package Homework4;

import java.util.Scanner;

public class SymbolCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter a character to count: ");
        char character = scanner.next().charAt(0);

        int count = findSymbolOccurance(inputString, character);
        System.out.println("The character '" + character + "' occurs " + count + " times in the string.");
    }

    public static int findSymbolOccurance(String inputString, char character) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}
