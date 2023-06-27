package com.company.lesson3;

public class Car {
    private String color;
    private String name;
    private double weight;

    public Car(String color, String name, double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
    }
}
