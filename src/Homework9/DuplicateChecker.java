package Homework9;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();

        int[] numbers = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Contains Duplicates: " + containsDuplicate(numbers));
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}

