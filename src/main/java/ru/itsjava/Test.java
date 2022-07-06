package ru.itsjava;

//        Написать метод, который разворачивает строку в обратном
//        порядке и замерить время работы этого метода на 1000,
//        10 000, 100 000 повторений.
//        Оформить надо в виде stand alone java приложения с
//        консольным вводом строки.
//        Результатом работы должны быть строка, развернутая строка
//        и 3 цифры (время работы).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    private static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку:");
        input = console.readLine();
        System.out.println("Исходная строка: \n" + input);
        System.out.println("Строка задом-наперед:");
        System.out.println(reverseInput(input));

        long workingTimeMethod1000 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            reverseInput(input);
        }
        System.out.println("Время работы метода за 1000 повторений: " + (System.currentTimeMillis()-workingTimeMethod1000));

        long workingTimeMethod10000 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            reverseInput(input);
        }
        System.out.println("Время работы метода за 10000 повторений: " + (System.currentTimeMillis()-workingTimeMethod10000));

        long workingTimeMethod100000 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            reverseInput(input);
        }
        System.out.println("Время работы метода за 100000 повторений: " + (System.currentTimeMillis()-workingTimeMethod100000));


    }

    public static String reverseInput(String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result = result + input.charAt(i);
        }
        return result;
    }
}
