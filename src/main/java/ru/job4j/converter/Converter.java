package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + dollar + " dollar.");

        float inputEuro = 140;
        float expectedEuro = 2;
        float outputEuro = Converter.rubleToEuro(inputEuro);
        boolean passedEuro = expectedEuro == outputEuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);

        float inputDollar = 180;
        float expectedDollar = 3;
        float outputDollar = Converter.rubleToDollar(inputDollar);
        boolean passedDollar = expectedDollar == outputDollar;
        System.out.println("180 rubles are 3 dollars. Test result : " + passedDollar);
    }
}
