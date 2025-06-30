package ru.job4j.condition;

public class Max {
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return this.max(this.max(a, b), c);
    }

    public int max(int a, int b, int c, int d) {
        return this.max(this.max(a, b), this.max(c, d));
    }
}

