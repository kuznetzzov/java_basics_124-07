package com.company.lesson3;

public class Tree {
    private int age;
    private boolean isAlive;
    private String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public void displayTreeInfo() {
        System.out.println("Tree Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Alive: " + isAlive);
    }
}
