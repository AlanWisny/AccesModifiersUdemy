package com.company;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account("Alan");
        acc.deposit(1000);
        acc.withdraw(500);
        acc.withdraw(-200);
        acc.deposit(-20);
        acc.calculateBalance();

        System.out.println("Balance on account is " + acc.getBalance());
    }
}
