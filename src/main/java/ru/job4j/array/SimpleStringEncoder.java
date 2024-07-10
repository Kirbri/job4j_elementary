package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol1 = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            char symbol2 = input.charAt(i);
            if (symbol1 == symbol2) {
                counter++;
            } else if (counter > 1) {
                result = result + symbol1 + counter;
                counter = 1;
                symbol1 = input.charAt(i);
            } else {
                result = result + symbol1;
                symbol1 = input.charAt(i);
            }
            if (i == input.length() - 1 && counter > 1) {
                result = result + symbol1 + counter;
                break;
            } else if (i == input.length() - 1) {
                result = result + symbol1;
            }
        }
        return input.length() > 1 ? result : input;
    }
}
