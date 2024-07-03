package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDifDiv(double first, double second) {
        return sum(difference(first, second), division(first, second));
    }

    public static double sumOfFourOperations(double first, double second) {
        return sumAndMultiply(first, second) + sumDifDiv(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат метода sumAndMultiply  равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат метода sumDifDiv  равен: " + sumDifDiv(10, 20));
        System.out.println("Результат метода sumOfFourOperations  равен: " + sumOfFourOperations(10, 20));
    }
}
