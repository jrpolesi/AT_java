package com.jrpolesi.exercicio10;

public record Produto(String nome, int quantidade, double preco) {

    @Override
    public String toString() {
        return "Produto: " + nome + ", Quantidade: " + quantidade + ", Preço: " + preco;
    }
}