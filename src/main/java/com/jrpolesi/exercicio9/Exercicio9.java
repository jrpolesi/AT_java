package com.jrpolesi.exercicio9;

public class Exercicio9 {
    public static void execute() {
        final var conta = new ContaBancaria("João");

        conta.exibirSaldo();
        System.out.println("--------------------");

        conta.depositar(100);
        conta.exibirSaldo();
        System.out.println("--------------------");

        conta.sacar(50);
        conta.exibirSaldo();
        System.out.println("--------------------");

        conta.sacar(100);
        conta.exibirSaldo();
        System.out.println("--------------------");
    }
}
