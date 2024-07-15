package com.bankaccount.model;

public class SavingsAccount extends Account {
    @Override
    public void printStatement() {
        System.out.println("=== Savings Account Statement ===");
        printCommonInfo();
    }
}
