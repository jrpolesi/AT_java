package com.jrpolesi.exercicio8;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        final var desconto = salarioBase * (10.0 / 100);
        return salarioBase - desconto;
    }
}
