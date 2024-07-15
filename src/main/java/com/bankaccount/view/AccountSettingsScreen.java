package com.bankaccount.view;

import com.bankaccount.model.Client;

import javax.swing.*;

public class AccountSettingsScreen {
    public static void updateAccountSettings(Client client) {
        String newName = JOptionPane.showInputDialog("Update client's name:", client.getName());
        if (newName != null && !newName.trim().isEmpty()) {
            client.setName(newName);
            JOptionPane.showMessageDialog(null, "Client's name updated to " + client.getName());
        }
    }
}
