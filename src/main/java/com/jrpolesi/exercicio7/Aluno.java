package com.jrpolesi.exercicio7;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    private double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void verificarAprovacao() {
        final var notaMinima = 7;
        final var media = calcularMedia();
        String statusDoAluno = media >= notaMinima ? "aprovado" : "reprovado";

        System.out.printf("O aluno %s foi %s com média %.1f", nome, statusDoAluno, media);
    }
}
