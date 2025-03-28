package com.jrpolesi.exercicio8;

public class Exercicio8 {
    public static void execute() {
        final var gerente = new Gerente("João", 2000);
        final var estagiario = new Estagiario("Maria", 1000);

        gerente.exibirSalario();
        System.out.println("--------------------");
        estagiario.exibirSalario();
    }
}
