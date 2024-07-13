package com.bank.tech;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato conta corrente ===");
        imprimirInfosComuns();
    }
}
