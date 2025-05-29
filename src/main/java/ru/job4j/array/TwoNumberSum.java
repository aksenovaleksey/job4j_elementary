package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        while (i < array.length - 1) {
            if (j < array.length) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
                j++;
            } else {
                i++;
                j = i + 1;
            }
        }
        return new int[0];
    }
}