package com.jrpolesi.exercicio9;

public class ContaBancaria {
    public final String titular;
    private double saldo = 0;

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        final var novoSaldo = saldo - valor;
        if (novoSaldo >= 0) {
            saldo = novoSaldo;
            return;
        }

        System.out.println("Saldo insuficiente");
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
