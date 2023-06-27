package com.company.lesson3;

public class JavaProgram {
    public static void main(String[] args) {

        Study study = new Study();
        study.printCourse("Изучение Java - это просто!");
        System.out.println();

        Car car = new Car("Red", "Lada", 915.0);
        Car car1 = new Car("Black", "Volga", 1200.0);
        car.displayInfo();
        System.out.println();
        car1.displayInfo();

        System.out.println();
        House house1 = new House();
        house1.setHouseDetails(2, 2020, "Home");

        House house2 = new House();
        house2.setHouseDetails(3, 2018, "Sweet Home");

        house1.displayHouseInfo();
        System.out.println();
        house2.displayHouseInfo();

        System.out.println();
        Tree tree1 = new Tree(10, "Баобаб");
        Tree tree2 = new Tree(20, true, "Береза");
        Tree tree3 = new Tree();
        System.out.println();

        tree1.displayTreeInfo();
        System.out.println();
        tree2.displayTreeInfo();
        System.out.println();

    }
}
