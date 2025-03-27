package com.jrpolesi.exercicio6;

public class Exercicio6 {
    public static void execute() {
        final var carro1 = new Veiculo(
                "AKH653",
                "Uno",
                2008,
                253_000);

        final var carro2 = new Veiculo(
                "JHG123",
                "Gol",
                2010,
                120_000);

        viajar(carro1, 155);
        System.out.println("--------------------");
        viajar(carro2, 237);
    }

    private static void viajar(Veiculo veiculo, double km) {
        veiculo.exibirDetalhes();

        System.out.println("\nIniciando viagem...");
        veiculo.registrarViagem(km);
        System.out.println("Viagem finalizada.\n");

        veiculo.exibirDetalhes();
    }
}
