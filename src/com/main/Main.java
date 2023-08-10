package com.main;

import com.core.ContaCorrente;
import com.core.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(500);
        System.out.println("O saldo inicial da conta corrente: " + cc.getSaldo());

        cc.sacar(150);
        System.out.println("O saldo atual da conta corrente: " + cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(500);
        System.out.println("O saldo inicial da conta poupanca: " + cp.getSaldo());

        cp.sacar(150);
        System.out.println("O saldo atual da conta poupanca: " + cp.getSaldo());

        cp.simularRendimento(0.1);
    }
}