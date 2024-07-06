package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        int[] numbers = new int[10];
        String[] names = new String[4];

        System.out.println("Размер массива ages равен : " + ages.length);
        System.out.println("Размер массива surnames равен : " + surnames.length);
        System.out.println("Размер массива prices равен : " + prices.length);
        System.out.println("Размер массива numbers равен : " + numbers.length);

        names[0] = "Альфия";
        names[1] = "Валентин";
        names[2] = "Кузьма";
        names[3] = "Владстон";

        System.out.println("Имена из массива names: ");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
