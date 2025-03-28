package com.jrpolesi.exercicio8;

public abstract class Funcionario {
    protected final String nome;
    protected final double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    protected double calcularSalario() {
        return salarioBase;
    }

    public void exibirSalario() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + calcularSalario());
    }
}
