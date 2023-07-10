package com.company.lesson6;

public class Truck extends Car {
    private int wheelsQuantity;
    private int maxWeight;

    public Truck(int weight, String model, char color, float speed, int wheelsQuantity, int maxWeight) {
        super(weight, model, color, speed);
        this.wheelsQuantity = wheelsQuantity;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int numberOfWheels) {
        this.wheelsQuantity = numberOfWheels;
        System.out.println("Количество колес у грузовика: " + this.wheelsQuantity);
    }
}
