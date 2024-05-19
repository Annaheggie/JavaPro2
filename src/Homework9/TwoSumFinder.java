package Homework9;

import java.util.*;

class TwoSumFinder {
    public int[] findTwoSum(int[] numbers, int targetSum) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        // Generate an array of numbers from 1 to 9
        int[] generatedArray = new Random().ints(1, 10).distinct().limit(9).toArray();
        int target = 10; // Set the target sum

        TwoSumFinder finder = new TwoSumFinder();
        int[] resultIndices = finder.findTwoSum(generatedArray, target);

        System.out.println("Generated Array: " + Arrays.toString(generatedArray));
        System.out.println("Target Sum: " + target);
        System.out.println("Indices of Two Numbers that Add Up to Target: " + Arrays.toString(resultIndices));
    }
}

