package com.jrpolesi.exercicio6;

public class Veiculo {
    private final String placa;
    private final String modelo;
    private final int anoDeFabricacao;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int anoDeFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de Fabricação: " + this.anoDeFabricacao);
        System.out.println("Quilometragem: " + this.quilometragem);
    }

    public void registrarViagem(double km) {
        this.quilometragem += km;
    }
}
