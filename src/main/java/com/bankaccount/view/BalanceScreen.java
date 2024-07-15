package com.bankaccount.view;

import com.bankaccount.model.Account;

import javax.swing.*;

public class BalanceScreen {
    public static void showBalance(Account account) {
        String balance = String.format("Agency: %d\nNumber: %d\nBalance: %.2f", account.getAgency(), account.getNumber(), account.getBalance());
        JOptionPane.showMessageDialog(null, balance, "Account Balance", JOptionPane.INFORMATION_MESSAGE);
    }
}
