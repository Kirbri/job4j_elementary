package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol1 = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol1 == input.charAt(i)) {
                counter++;
            } else {
                result = counter > 1 ?  result + symbol1 + counter : result + symbol1;
                counter = 1;
                symbol1 = input.charAt(i);
            }
        }
        result = counter > 1 ?  result + symbol1 + counter : result + symbol1;
        return result;
    }
}
