package ru.job4j.calculator;

public class Fit {

    private static final double MAN_OFFSET = 100;
    private static final double WOMAN_OFFSET = 110;
    private static final double COEFFICIENT = 1.15;

    public static double calculateWeight(short height, boolean isMan) {
        double offset = isMan ? MAN_OFFSET : WOMAN_OFFSET;
        return (height - offset) * COEFFICIENT;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;

        double manWeight = Fit.calculateWeight(heightMan, true);
        System.out.println("Ideal weight for a man with height 187 cm is " + manWeight + " kg");

        double womanWeight = Fit.calculateWeight(heightWoman, false);
        System.out.println("Ideal weight for a woman with height 170 cm is " + womanWeight + " kg");
    }
}
