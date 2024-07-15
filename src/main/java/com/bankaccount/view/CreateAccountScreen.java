package com.bankaccount.view;

import com.bankaccount.model.Account;
import com.bankaccount.model.CheckingAccount;
import com.bankaccount.model.SavingsAccount;

import javax.swing.*;

public class CreateAccountScreen {
    public static Account createAccount() {
        String[] accountTypes = {"Checking Account", "Savings Account"};
        String accountType = (String) JOptionPane.showInputDialog(null, "Select account type:", "Create Account",
                JOptionPane.QUESTION_MESSAGE, null, accountTypes, accountTypes[0]);

        if (accountType != null) {
            String clientName = JOptionPane.showInputDialog("Enter client's name:");
            if ("Checking Account".equals(accountType)) {
                Account ca = new CheckingAccount();
                // Configure client, associate with account, etc.
                JOptionPane.showMessageDialog(null, "Checking Account created successfully for " + clientName);
                return ca;
            } else {
                Account sa = new SavingsAccount();
                // Configure client, associate with account, etc.
                JOptionPane.showMessageDialog(null, "Savings Account created successfully for " + clientName);
                return sa;
            }
        }
        return null;
    }
}
