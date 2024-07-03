package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        double man = Fit.manWeight(heightMan);
        System.out.println("Man 187 is " + man);
        short heightWoman = 164;
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Woman 164 is " + woman);
    }

}
