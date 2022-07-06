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

        long startTime1000 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            reverseInput(input);
        }
        long endTime1000 = System.nanoTime();
        System.out.println("Время работы метода в мс за 1000 повторений: " + (endTime1000-startTime1000)/1000000);

        long startTime10000 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            reverseInput(input);
        }
        long endTime10000 = System.nanoTime();
        System.out.println("Время работы метода в мс за 10000 повторений: " + (endTime10000-startTime10000)/1000000);

        long startTime100000 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            reverseInput(input);
        }
        long endTime100000 = System.nanoTime();
        System.out.println("Время работы метода в мс за 100000 повторений: " + (endTime100000-startTime100000)/1000000);


    }

    public static String reverseInput(String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result = result + input.charAt(i);
        }
        return result;
    }
}
