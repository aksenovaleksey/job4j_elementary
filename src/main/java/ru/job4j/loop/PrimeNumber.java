package ru.job4j.loop;

public class PrimeNumber {

    public static boolean check(int finish) {
        boolean isPrime = finish > 1;
        for (int i = 2; i * i <= finish; i++) {
            if (finish % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (check(i)) {
                count++;
            }
        }
        return count;
    }
}
