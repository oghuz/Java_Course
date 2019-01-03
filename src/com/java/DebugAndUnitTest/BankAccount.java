package com.java.DebugAndUnitTest;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // the branch argument is true if the customer is performing the transaction
    // at the branch, with a teller
    // It's false if the customer is performing the transaction at an ATM

    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }
    public double withdraw(double amount, boolean branch) {
        balance -= amount;
        return balance;
    }

    public double getBalance(){
        return balance;
    }

}
