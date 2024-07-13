package com.bank.tech;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		String valorDeposito = JOptionPane.showInputDialog("Informe o valor para depósito na conta corrente:");
		cc.depositar(Double.parseDouble(valorDeposito));

		String valorTransferencia = JOptionPane.showInputDialog("Informe o valor para transferência para a conta poupança:");
		cc.tranferir(Double.parseDouble(valorTransferencia), cp);

		JOptionPane.showMessageDialog(null, "Extrato Conta Corrente:\n" + obterExtrato(cc));
		JOptionPane.showMessageDialog(null, "Extrato Conta Poupança:\n" + obterExtrato(cp));
	}

	private static String obterExtrato(Conta conta) {
		return String.format("Agencia: %d\nNumero: %d\nSaldo: %.2f", conta.getAgencia(), conta.getNumero(), conta.getSaldo());
	}
}
