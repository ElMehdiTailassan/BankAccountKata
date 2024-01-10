package com.bankAccount.kata.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Account class
 */
public class Account {
    private double balance;
    private final List<Transaction> transactions;

    public Account() {
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        validateAmount(amount);
        balance += amount;
        transactions.add(new Transaction("DEPOSIT", amount, balance));
    }

    public void withdraw(double amount) {
        validateAmount(amount);
        validateBalance(amount);
        balance -= amount;
        transactions.add(new Transaction("WITHDRAWAL", amount, balance));
    }

    public List<Transaction> getTransactions() {
        return new ArrayList<>(transactions);
    }

    private void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }

    private void validateBalance(double amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("Insufficient balance");
        }
    }
}
