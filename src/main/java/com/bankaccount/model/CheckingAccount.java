package com.bankaccount.model;

public class CheckingAccount extends Account {
    @Override
    public void printStatement() {
        System.out.println("=== Checking Account Statement ===");
        printCommonInfo();
    }
}
