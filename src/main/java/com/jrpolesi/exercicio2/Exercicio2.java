package com.jrpolesi.exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void execute() {
        final var scanner = new Scanner(System.in);

        final var username = inputTypeString(scanner, "Digite seu nome: ");

        String password = null;
        while (password == null) {
            final var passwordTry = inputTypeString(scanner, "Digite sua senha: ");

            final var validator = new PasswordValidator()
                    .minLength(8, "A senha deve conter no mínimo 8 caracteres.")
                    .containsUpperCase("A senha deve conter pelo menos uma letra maiúscula.")
                    .containsNumber("A senha deve conter pelo menos um número.")
                    .containsSpecialCharacter("A senha deve conter pelo menos um caractere especial.");
            final var errors = validator.validate(passwordTry);

            if (errors.isEmpty()) {
                password = passwordTry;
            } else {
                errors.forEach(e -> System.out.println("- " + e));
                System.out.println("Tente novamente.\n");
            }
        }
        scanner.close();

        System.out.printf("Olá %s\n", username);
        System.out.println("Acesso liberado.");
    }

    private static String inputTypeString(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
