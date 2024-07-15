package com.bankaccount.service;

import com.bankaccount.model.Account;

public interface IAccount {
    void withdraw(double amount);
    void deposit(double amount);
    void transfer(double amount, Account destinationAccount);
    void printStatement();
}
