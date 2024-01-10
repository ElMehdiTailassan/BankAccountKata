package com.bankAccount.kata.controller;

import com.bankAccount.kata.model.Transaction;
import com.bankAccount.kata.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * AccountController class for REST API .
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/deposit")
    public void deposit(@RequestParam double amount) {
        accountService.deposit(amount);
    }

    @PostMapping("/withdraw")
    public void withdraw(@RequestParam double amount) {
        accountService.withdraw(amount);
    }

    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
        return accountService.getAccount().getTransactions();
    }
}

