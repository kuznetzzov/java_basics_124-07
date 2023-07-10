package com.company.lesson6;

import java.util.Scanner;

public class SubTask5 extends Task5 {
    private Task5 task5;

    public SubTask5(Task5 task5) {
        this.task5 = task5;
    }

    public void getUserName() {
        Scanner scanner = task5.getScanner();
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Ваше имя: " + name);
    }
}
