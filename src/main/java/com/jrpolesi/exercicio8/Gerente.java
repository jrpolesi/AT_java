package com.jrpolesi.exercicio8;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        final var extra = salarioBase * (20.0 / 100);
        return salarioBase + extra;
    }
}
