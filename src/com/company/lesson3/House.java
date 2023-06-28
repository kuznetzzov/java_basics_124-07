package com.company.lesson3;


public class House {
    private int numberOfFloors;
    private int yearBuilt;
    private String name;

    public void setHouseDetails(int numberOfFloors, int yearBuilt, String name) {
        this.numberOfFloors = numberOfFloors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }

    public void displayHouseInfo() {
        System.out.println("Name: " + name);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Year Built: " + yearBuilt);
        System.out.println("Years Since Built: " + calculateYearsBuilt());
    }

    private int calculateYearsBuilt() {
        return 2023 - yearBuilt;
    }
}

