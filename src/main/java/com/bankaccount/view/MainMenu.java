package com.bankaccount.view;

import com.bankaccount.model.Client;
import com.bankaccount.model.Account;

import javax.swing.*;

public class MainMenu {
	public static void main(String[] args) {
		String[] options = {"Login", "Create Account", "View Balance", "Transaction History", "Account Settings", "Exit"};
		Account account = null;
		Client client = new Client();
		String[] transactions = {}; // To store transaction history
		int choice;

		do {
			choice = JOptionPane.showOptionDialog(null, "Select an option", "Main Menu",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

			switch (choice) {
				case 0:
					if (LoginScreen.login()) {
						JOptionPane.showMessageDialog(null, "Login successful");
					} else {
						JOptionPane.showMessageDialog(null, "Invalid credentials");
					}
					break;
				case 1:
					account = CreateAccountScreen.createAccount();
					break;
				case 2:
					if (account != null) {
						BalanceScreen.showBalance(account);
					} else {
						JOptionPane.showMessageDialog(null, "No account created");
					}
					break;
				case 3:
					TransactionHistoryScreen.showHistory(transactions);
					break;
				case 4:
					if (client != null) {
						AccountSettingsScreen.updateAccountSettings(client);
					} else {
						JOptionPane.showMessageDialog(null, "No client configured");
					}
					break;
			}
		} while (choice != 5);

		JOptionPane.showMessageDialog(null, "Thank you for using Bank Account. See you soon!");
	}
}
