package com.company.lesson1;

import com.company.lesson2.Calculator;

import java.util.Scanner;

public class LabOne {
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        System.out.println();
        double x = (46 + 10) * (10.0 / 3);
        System.out.println(x); // 186.66666666666669, если прописать 10.0, иначе 186.0
        int y = (29) * (4) * (-15);
        System.out.println(y); // -1740

        System.out.println();

        int number = 10500;
        double numberExp = (number / 10.0) / 10;
        System.out.println(numberExp); // 1050

        System.out.println();

        double result = 3.6 * 4.1 * 5.9; // 87.084
        System.out.println(result);

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 42");
        int num1 = scanner.nextInt();
        System.out.println("Введите число 100");
        int num2 = scanner.nextInt();
        System.out.println("Введите число 125");
        int num3 = scanner.nextInt();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println();

        System.out.println("Введите число:");
        int b = scanner.nextInt();
        if (b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            if (b % 2 == 0) {
                System.out.println("Четное");
            } else {
                System.out.println("Нечетное");
            }
        }

    }
}
