package com.company.lesson6;

public class Client extends Person implements PrintRepo {
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    public void printInfo() {
        System.out.println("Информация по клиенту:");
        System.out.println("Имя: " + getLastName() + " " + getFirstName());
        System.out.println("Банк: " + bankName);
        System.out.println();
    }
}
