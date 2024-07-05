package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        float p = 6;
        float k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP5dot5K10Square0dot625() {
        float expected = 0.625f;
        float p = 5.5f;
        float k = 10;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whenP168K65dot3Square104dot81() {
        float expected = 104.82f;
        float p = 168;
        float k = 65.3f;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double out = RectangleArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }
}