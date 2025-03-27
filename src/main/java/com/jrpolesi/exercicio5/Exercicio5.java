package com.jrpolesi.exercicio5;

public class Exercicio5 {
    public static void execute() {
        final var contentType = "text/html";

        final var headTitle = "Saudação CGI";
        final var pageTitle = "Olá, Terráqueos!";

        System.out.println("Content-Type: " + contentType);
        System.out.println();

        System.out.printf("""
                <html>
                <head><title>%s</title></head>
                <body>
                <h1>%s</h1>
                </body>
                </html>
                """, headTitle, pageTitle);

    }
}
