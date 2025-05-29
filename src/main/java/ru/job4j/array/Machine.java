package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int i = 0;
        int j = money - price;
        while (i < coins.length && j > 0) {
            if (j >= coins[i]) {
                result[size++] = coins[i];
                j -= coins[i];
            } else {
                i++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
