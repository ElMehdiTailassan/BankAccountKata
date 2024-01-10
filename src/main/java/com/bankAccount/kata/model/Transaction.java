package com.bankAccount.kata.model;

import java.time.LocalDate;

/**
 * Transaction class represents transactions.
 */
public class Transaction {
    private final LocalDate date;
    private final String type;
    private final double amount;
    private final double balanceAfterTransaction;

    public Transaction(String type, double amount, double balanceAfterTransaction) {
        this.date = LocalDate.now();
        this.type = type;
        this.amount = amount;
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalanceAfterTransaction() {
        return balanceAfterTransaction;
    }
}

