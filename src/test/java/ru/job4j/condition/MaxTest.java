package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To1Then5() {
        int left = 5;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax9To111Then111() {
        int left = 9;
        int right = 111;
        int result = Max.max(left, right);
        int expected = 111;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax67To67Then1Any() {
        int left = 67;
        int right = 67;
        int result = Max.max(left, right);
        int expected = 67;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax67To67To178Then178() {
        int one = 67;
        int two = 67;
        int three = 178;
        int result = Max.max(one, two, three);
        int expected = 178;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax0To0To234ToMinus84Then234() {
        int one = 0;
        int two = 1;
        int three = 234;
        int four = -84;
        int result = Max.max(one, two, three, four);
        int expected = 234;
        assertThat(result).isEqualTo(expected);
    }
}