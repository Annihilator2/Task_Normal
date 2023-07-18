package com.example.task2;

import java.util.ArrayList;
import java.util.List;

public class Magnit {
    public static void main(String[] args) {
        int start = 100;// Интервал кодов
        int end = 10000000;
        List<Integer> Codes = getCodes(start, end);

        System.out.println("Number of commodity codes: " + Codes.size());//Вывод данных
        System.out.println("Commodity codes:");
        for (int code : Codes) {
            System.out.println(code);
        }
    }

    public static List<Integer> getCodes(int start, int end) {
        List<Integer> Codes = new ArrayList<>();

        int a = 0;
        int b = 1;

        while (b <= end) {//Числа Фибоначчи с проверкой на делимость
            if (b >= start && b % 13 == 0) {
                Codes.add(b);
            }

            int temp = a + b;
            a = b;
            b = temp;
        }

        return Codes;
    }
}