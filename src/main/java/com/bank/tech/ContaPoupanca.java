package com.bank.tech;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato conta poupança ===");
        imprimirInfosComuns();
    }
}
