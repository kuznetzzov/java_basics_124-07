package com.company.lesson6;

import java.util.Scanner;

public class Task5 {
    private Scanner scanner;

    public Task5() {
        scanner = new Scanner(System.in);
    }

    public int getUserAge() {
        System.out.print("Введите ваш возраст: ");
        return scanner.nextInt();
    }

    public Scanner getScanner() {
        return scanner;
    }

    public static void main(String[] args) {
        SubTask5 subTask5 = new SubTask5(new Task5());
        subTask5.getUserName();
    }
}
