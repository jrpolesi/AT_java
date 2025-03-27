package com.jrpolesi.exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void execute() {
        final var scanner = new Scanner(System.in);

        final var name = inputTypeString(scanner, "Digite o nome:");
        final var salary = inputTypeDouble(scanner, "Digite o salário:");
        scanner.close();

        final var taxes = calculateTaxes(salary);

        System.out.println("--------------------");
        System.out.printf("Olá %s\n", name);
        System.out.printf("O seu salário bruto é R$%.2f\n", salary);
        System.out.printf("O total de impostos é R$%.2f\n", taxes);
        System.out.printf("O seu salário líquido é R$%.2f\n", salary - taxes);
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

    private static double calculateTaxes(double salary) {
        if (salary >= 45_012.61) {
            return salary * (27.5 / 100);
        }

        if (salary >= 33_919.81) {
            return salary * (15.0 / 100);
        }

        if (salary >= 22_847.77) {
            return salary * (7.5 / 100);
        }

        return 0;
    }
}