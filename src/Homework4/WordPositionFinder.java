package Homework4;

import java.util.Scanner;

public class WordPositionFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the source string:");
        String source = scanner.nextLine();
        System.out.println("Enter the target string:");
        String target = scanner.nextLine();

        int position = findWordPosition(source, target);
        System.out.println("Result: " + position);
    }

    public static int findWordPosition(String source, String target) {
        if (source.contains(target)) {
            return source.indexOf(target);
        } else {
            return -1;
        }
    }
}

