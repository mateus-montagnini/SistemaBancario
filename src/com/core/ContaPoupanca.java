package com.core;

public class ContaPoupanca extends Conta {

    @Override
    public void sacar(double valor) {
        this.saldo -= valor + 2;
    }

}
