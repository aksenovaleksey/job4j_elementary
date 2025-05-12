package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}


