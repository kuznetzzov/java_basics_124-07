package com.company.lesson6;

public class BankEmployee extends Person implements PrintRepo {
    private String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    public void printInfo() {
        System.out.println("Информация по работнику банка:");
        System.out.println("Имя: " + getFirstName() + " " + getLastName());
        System.out.println("Банк: " + bankName);
        System.out.println();
    }
}
