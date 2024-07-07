package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        while (i < array.length) {
            if (array[i] + array[j] != target) {
                if (j + 1 == array.length) {
                    break;
                }
                j++;
            } else {
                return new int[]{i, j};
            }
            if (j == array.length - 1) {
                i++;
                j = 0;
            }
        }
        return new int[0];
    }
}
