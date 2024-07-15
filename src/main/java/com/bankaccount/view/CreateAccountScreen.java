package com.bankaccount.view;

import com.bankaccount.model.Conta;
import com.bankaccount.model.ContaCorrente;
import com.bankaccount.model.ContaPoupanca;

import javax.swing.*;

public class CreateAccountScreen {
    public static Conta createAccount() {
        String[] accountTypes = {"Conta Corrente", "Conta Poupança"};
        String accountType = (String) JOptionPane.showInputDialog(null, "Selecione o tipo de conta:", "Criar Conta",
                JOptionPane.QUESTION_MESSAGE, null, accountTypes, accountTypes[0]);

        if (accountType != null) {
            String nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente:");
            if ("Conta Corrente".equals(accountType)) {
                Conta cc = new ContaCorrente();
                // Configurar cliente, associar à conta, etc.
                JOptionPane.showMessageDialog(null, "Conta Corrente criada com sucesso para " + nomeCliente);
                return cc;
            } else {
                Conta cp = new ContaPoupanca();
                // Configurar cliente, associar à conta, etc.
                JOptionPane.showMessageDialog(null, "Conta Poupança criada com sucesso para " + nomeCliente);
                return cp;
            }
        }
        return null;
    }
}
