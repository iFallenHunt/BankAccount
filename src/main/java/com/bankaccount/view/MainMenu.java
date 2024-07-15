package com.bankaccount.view;

import com.bankaccount.model.Cliente;
import com.bankaccount.model.Conta;

import javax.swing.*;

public class MainMenu {
	public static void main(String[] args) {
		String[] options = {"Login", "Criar Conta", "Ver Saldo", "Histórico de Transações", "Configurações da Conta", "Sair"};
		Conta conta = null;
		Cliente cliente = new Cliente();
		String[] transactions = {}; // Para armazenar histórico de transações
		int choice;

		do {
			choice = JOptionPane.showOptionDialog(null, "Selecione uma opção", "Menu Principal",
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
					conta = CreateAccountScreen.createAccount();
					break;
				case 2:
					if (conta != null) {
						BalanceScreen.showBalance(conta);
					} else {
						JOptionPane.showMessageDialog(null, "Nenhuma conta criada");
					}
					break;
				case 3:
					TransactionHistoryScreen.showHistory(transactions);
					break;
				case 4:
					if (cliente != null) {
						AccountSettingsScreen.updateAccountSettings(cliente);
					} else {
						JOptionPane.showMessageDialog(null, "Nenhum cliente configurado");
					}
					break;
			}
		} while (choice != 5);

		JOptionPane.showMessageDialog(null, "Obrigado por usar o Bank Account. Até logo!");
	}
}
