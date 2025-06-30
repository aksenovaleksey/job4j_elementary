package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMaxOfTwoNumbersThenReturnLarger() {
        Max max = new Max();
        int result = max.max(5, 10);
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void whenMaxOfThreeNumbersThenReturnLargest() {
        Max max = new Max();
        int result = max.max(5, 10, 7);
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void whenMaxOfFourNumbersThenReturnLargest() {
        Max max = new Max();
        int result = max.max(5, 10, 7, 12);
        assertThat(result).isEqualTo(12);
    }

    @Test
    public void whenAllNumbersAreEqual() {
        Max max = new Max();
        int result = max.max(3, 3, 3, 3);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void whenNegativeNumbers() {
        Max max = new Max();
        int result = max.max(-5, -10, -3, -15);
        assertThat(result).isEqualTo(-3);
    }
}



