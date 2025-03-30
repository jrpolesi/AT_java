package com.jrpolesi.exercicio10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio10 {
    public static void execute() {
        final var scanner = new Scanner(System.in);

        final var produtos = new ArrayList<Produto>();

        for (int i = 0; i < 2; i++) {
            final var produto = inputProduto(scanner);
            System.out.println("------------------");
            produtos.add(produto);
        }
        scanner.close();

        saveProdutos(produtos);

        printProdutosFromFile();
    }

    private static Produto inputProduto(Scanner scanner) {
        System.out.println("Cadastrar produto");
        final var nome = inputTypeString(scanner, "Digite o nome do produto:");
        final var quantidade = inputTypeInt(scanner, "Digite a quantidade do produto:");
        final var preco = inputTypeDouble(scanner, "Digite o preço do produto:");

        return new Produto(nome, quantidade, preco);
    }

    private static void saveProdutos(List<Produto> produtos) {
        try {
            final var writter = new BufferedWriter(new FileWriter("compras.txt"));

            for (Produto produto : produtos) {
                System.out.println(produto.toString());
                final var row = String.format("%s,%d,%.2f", produto.nome(), produto.quantidade(), produto.preco());
                writter.write(row);
                writter.newLine();
            }
            writter.close();
        } catch (Exception e) {
            System.out.println("Erro ao salvar o arquivo compras.txt");
        }
    }

    private static void printProdutosFromFile() {
        System.out.println("\nListando produtos...");

        try {
            final var reader = new Scanner("compras.txt");
            while (reader.hasNextLine()) {
                final var line = reader.nextLine();
                final var values = line.split(",");

                final var nome = values[0];
                final var quantidade = Integer.parseInt(values[1]);
                final var preco = Double.parseDouble(values[2]);

                final var produto = new Produto(nome, quantidade, preco);
                System.out.println(produto.toString());
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo compras.txt");
        }
    }

    private static String inputTypeString(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    private static double inputTypeDouble(Scanner scanner, String message) {
        System.out.println(message);
        final var result = scanner.nextDouble();
        scanner.nextLine();

        return result;
    }

    private static int inputTypeInt(Scanner scanner, String message) {
        System.out.println(message);
        final var result = scanner.nextInt();
        scanner.nextLine();

        return result;
    }
}
