package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int i = 0;
        while (money != price) {
            if (price + coins[i] <= money) {
                result[size++] = coins[i];
                price += coins[i];
            } else {
                i++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
