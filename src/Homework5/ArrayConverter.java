package Homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();

        int[] arr = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(100); // Generate random numbers between 0 and 99
        }

        List<Integer> list = toList(arr);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("List: " + list);
    }

    public static List<Integer> toList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }
}
