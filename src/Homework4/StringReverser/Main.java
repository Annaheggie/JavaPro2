package Homework4.StringReverser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        StringManipulation stringReverser = new StringReverser();
        String reversedString = stringReverser.manipulateString(input);

        System.out.println("Reversed string: " + reversedString);
    }
}
