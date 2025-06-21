package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PointTest {

    @Test
    void whenDistanceBetween00And02Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        double expected = 2.0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDistanceBetween00And34Then5() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double result = a.distance(b);
        double expected = 5.0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDistanceBetweenNegativePointsThenPositive() {
        Point a = new Point(-1, -1);
        Point b = new Point(-4, -5);
        double result = a.distance(b);
        double expected = 5.0; // sqrt((-3)^2 + (-4)^2) = 5
        assertThat(result).isEqualTo(expected);
    }
}