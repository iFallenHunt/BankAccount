package com.bankaccount.view;

import javax.swing.*;

public class TransactionHistoryScreen {
    public static void showHistory(String[] transactions) {
        JList<String> transactionList = new JList<>(transactions);
        JScrollPane scrollPane = new JScrollPane(transactionList);
        JOptionPane.showMessageDialog(null, scrollPane, "Transaction History", JOptionPane.INFORMATION_MESSAGE);
    }
}
