package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point x = new Point(0, 2);
        Point y = new Point(0, 0);
        double output = x.distance(y);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when19to08then1dot4142() {
        double expected = 1.4142;
        Point x = new Point(1, 9);
        Point y = new Point(0, 8);
        double value = 0.0001f;
        double output = x.distance(y);
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void when6Minus9to7Minus3then6dot08() {
        double expected = 6.08;
        Point x = new Point(6, -9);
        Point y = new Point(7, -3);
        double output = x.distance(y);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus600to0Minus100then116dot619() {
        double expected = 116.619;
        Point x = new Point(-60, 0);
        Point y = new Point(0, -100);
        double output = x.distance(y);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void when005to029then4dot472() {
        double expected = 4.472;
        Point x = new Point(0, 0, 5);
        Point y = new Point(0, 2, 9);
        double output = x.distance3d(y);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void when1Minus85toMinus704then11dot358() {
        double expected = 11.358;
        Point x = new Point(1, -8, 5);
        Point y = new Point(-7, 0, 4);
        double output = x.distance3d(y);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }
}