package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when19to08then1dot4142() {
        double expected = 1.4142;
        int x1 = 1;
        int x2 = 0;
        int y1 = 9;
        int y2 = 8;
        double value = 0.0001f;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void when6Minus9to7Minus3then6dot08() {
        double expected = 6.08;
        int x1 = 6;
        int y1 = -9;
        int x2 = 7;
        int y2 = -3;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus600to0Minus100then116dot619() {
        double expected = 116.619;
        int x1 = -60;
        int y1 = 0;
        int x2 = 0;
        int y2 = -100;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }
}