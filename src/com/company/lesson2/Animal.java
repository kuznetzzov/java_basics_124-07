package com.company.lesson2;

public class Animal {
    private String species;
    private String name;
    private int age;
    private double weight;
    private boolean domestic;

    public Animal() {
        this.species = "Unknown";
        this.name = "Unnamed";
        this.age = 0;
        this.weight = 0.0;
        this.domestic = false;
    }

    public Animal(String species, String name, int age, double weight, boolean domestic) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.domestic = domestic;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }
}
