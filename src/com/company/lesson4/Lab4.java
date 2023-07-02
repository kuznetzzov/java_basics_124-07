package com.company.lesson4;

import java.util.*;

public class Lab4 {
    public static void main(String[] args) {

        /**
         * Напишите программу, которая выводит на консоль нечетные числа
         * от 1 до 99. Каждое число печатается с новой строки.
         */
        int a = 0;
        while (a < 100) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
            a++;
        }

        /**
         * Напишите программу, которая выводит числа от 1 до 100, делящиеся
         * на 3, 5 и на то, и другое (то есть и на 3 и на 5).
         * Пример вывода:
         * Делится на 3: ….
         * Делится на 5: ….
         * Делится на 3 и на 5:
         */
        int b = 1;
        while (b < 100) {
            if (b % 3 == 0 && b % 5 != 0) {
                System.out.println("Делится на 3: " + b);
            }
            if (b % 3 != 0 && b % 5 == 0) {
                System.out.println("Делится на 5: " + b);
            }
            if (b % 3 == 0 && b % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + b);
            }
            b++;
        }

        /**
         * Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true,
         * если сумма равна третьему целому числу. Пример вывода:
         * Введите первое число: 5
         * Введите второе число: 10
         * Введите третье число: 15
         * Результат: true
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();
        boolean result = checkSum(num1, num2, num3);
        System.out.println("Результат: " + result);

        /**
         * Напишите программу, которая принимает от пользователя три целых числа и возвращает true,
         * если второе число больше первого числа, а третье число больше второго числа. Пример вывода:
         *
         * Введите первое число: 5
         * Введите второе число: 10
         * Введите третье число: 15
         * Результат: true
         */
        System.out.print("Введите первое число: ");
        int num4 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num5 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num6 = scanner.nextInt();
        boolean result1 = checkNumbers(num4, num5, num6);
        System.out.println("Результат: " + result1);

        /**
         * Напишите программу, чтобы проверить, появляется ли число 3 как первый или последний элемент массива целых чисел.
         * Длина массива должна быть больше или равна двум. Пример вывода:
         * array = 3, -3, 7, 4, 5, 4, 3
         * true
         */
        int[] array = {3, -3, 7, 4, 5, 4, 3};
        boolean result2 = checkElement(array, 3);
        System.out.println(result2);


        /**
         * Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
         */
        int[] array1 = {2, 4, 3, 1, 8, 6};
        boolean result3 = containsNumber(array1, 1) || containsNumber(array1, 3);
        System.out.println(result3);

        /**
         * Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
         * Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет
         * выводиться текст “Please, try again”
         */
        int[] array2 = {1, 2, 3, 4, 5};
        boolean sorted = isSortAsc(array2);
        if (sorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }

        /**
         * Напишите программу, которая считывает с клавиатуры длину массива
         * (например, пользователь вводит цифру 4), затем пользователь вводит
         * 4 числа и на новой строке выводится массив из 4 элементов. Пример вывода:
         *
         *    Array length: 4
         *    Numbers of array:
         *    5
         *    6
         *    7
         *    2
         *    Result: [5, 6, 7, 2]
         */

        System.out.print("Array length: ");
        int length = scanner.nextInt();
        int[] array3 = new int[length];
        System.out.println("Numbers of array:");
        for (int i = 0; i < length; i++) {
            array3[i] = scanner.nextInt();
        }

        System.out.print("Result: [");
        for (int i = 0; i < length; i++) {
            System.out.print(array3[i]);
            if (i != length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        /**
         * Напишите метод, который меняет местами первый и последний элемент массива. Пример вывода:
         * Array 1: [5, 6, 7, 2]
         * Array 2: [2, 6, 7, 5]
         */
        int[] array4 = {5, 6, 7, 2};
        System.out.println("Array 1: " + Arrays.toString(array4));
        changeFirstAndLast(array4);
        System.out.println("Array 2: " + Arrays.toString(array4));

        /**
         * Дан массив чисел. Найдите первое уникальное в этом массиве число.
         * Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
         */
        int[] array5 = {1, 2, 3, 1, 2, 4};
        int uniqNumber = findFirstUniqNum(array5);
        System.out.println("First unique number: " + uniqNumber);

        /**
         * Заполните массив случайным числами и отсортируйте его
         * Используйте сортировку слиянием (Показывали на лекции, сказали пропустить)
         */
        int[] array6 = new int[10]; // Задаем размер массива
        arrayWithRandomNumbers(array6);
        System.out.println("Array before sorting: " + Arrays.toString(array6));
        Arrays.sort(array6);
        System.out.println("Array after sorting: " + Arrays.toString(array6));
    }


    public static boolean checkSum(int num1, int num2, int num3) {
        return num1 + num2 == num3;
    }

    public static boolean checkNumbers(int num4, int num5, int num6) {
        return num5 > num4 && num6 > num5;
    }

    public static boolean checkElement(int[] array, int number) {
        if (array.length < 2) {
            return false;
        }
        return array[0] == number || array[array.length - 1] == number;
    }

    public static boolean containsNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSortAsc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void changeFirstAndLast(int[] array) {
        if (array.length >= 2) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }
    }

    public static int findFirstUniqNum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            boolean isUnique = true;

            for (int j = 0; j < array.length; j++) {
                if (i != j && currentNumber == array[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return currentNumber;
            }
        }
        return 0;
    }

    public static void arrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
