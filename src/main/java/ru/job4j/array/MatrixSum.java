package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int[] arr1 : array) {
            for (int i = 0; i < arr1.length; i++) {
                result += arr1[i];
            }
        }
        return result;
    }
}
