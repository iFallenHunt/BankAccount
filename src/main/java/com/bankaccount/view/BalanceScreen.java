package com.bankaccount.view;

import com.bankaccount.model.Conta;

import javax.swing.*;

public class BalanceScreen {
    public static void showBalance(Conta conta) {
        String saldo = String.format("Agência: %d\nNúmero: %d\nSaldo: %.2f", conta.getAgencia(), conta.getNumero(), conta.getSaldo());
        JOptionPane.showMessageDialog(null, saldo, "Saldo da Conta", JOptionPane.INFORMATION_MESSAGE);
    }
}
