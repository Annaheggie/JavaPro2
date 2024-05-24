package Homework10;

import java.util.Arrays;

public class ArrayValueCalculator {

    public static void main(String[] args) {
        String[][] inputArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = doCalc(inputArray);
            System.out.println("Calculation Result: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4 || Arrays.stream(array).anyMatch(row -> row.length != 4)) {
            throw new ArraySizeException("Input array size must be 4x4");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Incorrect data at cell (" + i + "," + j + ")");
                }
            }
        }
        return sum;
    }
}

class ArraySizeException extends Exception {
    public ArraySizeException(String message) {
        super(message);
    }
}

class ArrayDataException extends Exception {
    public ArrayDataException(String message) {
        super(message);
    }
}
