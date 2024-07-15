package com.bankaccount.model;

import com.bankaccount.service.IAccount;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Account implements IAccount {

    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;

    public Account() {
        this.agency = Account.DEFAULT_AGENCY;
        this.number = SEQUENTIAL++;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void transfer(double amount, Account destinationAccount) {
        this.withdraw(amount);
        destinationAccount.deposit(amount);
    }

    protected void printCommonInfo() {
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }
}
