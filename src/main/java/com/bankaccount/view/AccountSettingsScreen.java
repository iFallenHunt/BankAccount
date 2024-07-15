package com.bankaccount.view;

import com.bankaccount.model.Cliente;

import javax.swing.*;

public class AccountSettingsScreen {
    public static void updateAccountSettings(Cliente cliente) {
        String novoNome = JOptionPane.showInputDialog("Atualize o nome do cliente:", cliente.getNome());
        if (novoNome != null && !novoNome.trim().isEmpty()) {
            cliente.setNome(novoNome);
            JOptionPane.showMessageDialog(null, "Nome do cliente atualizado para " + cliente.getNome());
        }
    }
}
