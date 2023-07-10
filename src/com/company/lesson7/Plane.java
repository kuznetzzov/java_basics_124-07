package com.company.lesson7;

public class Plane {
    private Wing wing;

    public Plane() {
        wing = new Wing();
    }

    public void setWingWeight(int weight) {
        wing.setWeight(weight);
    }

    public void showWingWeight() {
        System.out.println("Вес крыла: " + wing.getWeight());
    }

    private class Wing {
        private int weight;

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Plane mig27 = new Plane();
        mig27.setWingWeight(997);
        mig27.showWingWeight();

        Plane tu154 = new Plane();
        tu154.setWingWeight(2321);
        tu154.showWingWeight();
    }
}
