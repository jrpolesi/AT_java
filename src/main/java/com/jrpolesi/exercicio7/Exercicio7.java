package com.jrpolesi.exercicio7;

public class Exercicio7 {
    public static void execute() {
        final var aluno = new Aluno(
                "João",
                "193UAH2",
                10,
                8,
                9
        );

        aluno.verificarAprovacao();
    }
}
