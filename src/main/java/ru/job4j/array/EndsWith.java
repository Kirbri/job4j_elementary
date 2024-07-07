package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int i = (word.length - postfix.length); i < word.length; i++) {
            if (word[i] != postfix[i - postfix.length - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
