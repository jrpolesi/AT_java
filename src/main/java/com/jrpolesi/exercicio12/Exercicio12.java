package com.jrpolesi.exercicio12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio12 {
    public static void execute() {
        final var scanner = new Scanner(System.in);
        final var user1 = inputTypeString(scanner, "Digite o nome do primeiro usuário: ");
        final var user2 = inputTypeString(scanner, "Digite o nome do segundo usuário: ");
        System.out.println();

        final var users = new String[]{user1, user2};
        final var messages = new ArrayList<String>();

        while (messages.size() < 10) {
            for (String user : users) {
                final var inputMessage = String.format("%s, digite sua mensagem: ", user);
                final var message = inputTypeString(scanner, inputMessage);
                messages.add(String.format("%s: %s", user, message));
            }
        }
        scanner.close();

        System.out.println();
        showMessages(messages);
        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! \uD83D\uDE80");
    }

    private static void showMessages(List<String> messages) {
        System.out.println("===== Histórico de Mensagens =====");
        for (String message : messages) {
            System.out.println(message);
        }
    }

    private static String inputTypeString(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
