package com.bankaccount.service;

import com.bankaccount.model.Conta;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
}
