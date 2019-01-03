package com.java.DebugAndUnitTest;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
       BankAccount account = new BankAccount("Osmanjan", "Omar", 1000.00);
       double balance = account.deposit(200.00, true);
       assertEquals(1200, balance, 0);
       assertEquals(1200, account.getBalance(), 0);

    }

    @org.junit.jupiter.api.Test
    void getBalance_Deposit() {
        BankAccount account = new BankAccount("Osmanjan", "Omar", 1000.00);
        account.deposit(200,true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_Withdraw() {
        BankAccount account = new BankAccount("Osmanjan", "Omar", 1000.00);
       account.withdraw(200, true);
        assertEquals(800.00, account.getBalance(), 0);
    }




}