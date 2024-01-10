package com.bankAccount.kata.services;

import com.bankAccount.kata.model.Account;
import org.springframework.stereotype.Service;

/**
 * AccountService class
 */
@Service
public class AccountService {
    private final Account account;

    public AccountService() {
        this.account = new Account();
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public Account getAccount() {
        return account;
    }
}
