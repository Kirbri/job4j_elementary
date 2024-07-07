package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int[] arr1 : array) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] < 0) {
                    arr1[i] = 0;
                }
            }
        }
        return array;
    }
}
