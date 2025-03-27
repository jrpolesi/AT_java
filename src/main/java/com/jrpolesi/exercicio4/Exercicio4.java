package com.jrpolesi.exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public static void execute() {
        final var scanner = new Scanner(System.in);

        final var name = inputTypeString(scanner, "Digite seu nome:");

        final var value = inputTypeDouble(scanner, "Digite o valor do empréstimo:");
        final var installments = inputTypeInt(scanner, "Digite a quantidade de parcelas:");

        if (installments < 6 || installments > 48) {
            System.out.println("A quantidade de parcelas deve ser entre 6 e 48");
            return;
        }

        scanner.close();

        final var monthlyValue = calculateMonthlyValue(value);
        final var totalValue = calculateTotalValue(value, installments);

        System.out.println("--------------------");
        System.out.printf("Olá %s\n", name);
        System.out.printf("O valor da parcela mensal é R$%.2f\n", monthlyValue);
        System.out.printf("O valor total é R$%.2f\n", totalValue);
    }

    private static double calculateMonthlyValue(double value) {
        int monthlyTax = 3 / 100;
        return value * monthlyTax;
    }

    private static double calculateTotalValue(double value, int installments) {
        return value * installments;
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
