package com.jrpolesi.exercicio11;

import java.util.*;

public class Exercicio11 {
    public static void execute() {

        final var gameNumbers = generateNumbersOfGame();
        final var userNumbers = inputUserGuess();

        System.out.println("Números sorteados: " + gameNumbers);
        System.out.println("Seus números: " + userNumbers);

        final var matchedNumbers = new ArrayList<Integer>(userNumbers);
        matchedNumbers.retainAll(gameNumbers);
        System.out.println("Você acertou " + matchedNumbers.size() + " número(s)!");
    }

    private static List<Integer> generateNumbersOfGame() {
        final var random = new Random();
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 6) {
            numbers.add(random.nextInt(60) + 1);
        }

        return new ArrayList<>(numbers);
    }

    private static List<Integer> inputUserGuess() {
        final var scanner = new Scanner(System.in);
        Set<Integer> userNumbers = new HashSet<>();

        System.out.println("Digite 6 números entre 1 e 60");

        while (userNumbers.size() < 6) {
            final var userInput = inputNumber(scanner);

            if (!userNumbers.add(userInput)) {
                System.out.println("Número já inserido. Digite outro número.");
            }
        }
        scanner.close();

        return new ArrayList<>(userNumbers);
    }

    private static int inputNumber(Scanner scanner) {
        System.out.print("Digite um número: ");
        final var result = scanner.nextInt();
        scanner.nextLine();

        if (result < 1 || result > 60) {
            System.out.println("Número inválido. Tente novamente.");
            return inputNumber(scanner);
        }

        return result;
    }
}
