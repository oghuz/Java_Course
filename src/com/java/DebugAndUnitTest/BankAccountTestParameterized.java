package com.java.DebugAndUnitTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParameterized {
    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @BeforeEach
    public void setUp() {
        account = new BankAccount("Osmanjan", "Omar", 1000, BankAccount.CHECKING);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {100.00, true, 1100.00},
                {200.00, true, 1200},
                {325.00, true, 1325.00},
                {489.00, true, 1489.00},
                {1000.00, true, 2000.00}
        });
    }

    @Test
    public void deposit() throws Exception {
        account.deposit(200.00, true);
        assertEquals(expected, account.getBalance(), 0.01);
    }

}
