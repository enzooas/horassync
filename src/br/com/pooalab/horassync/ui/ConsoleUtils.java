package br.com.pooalab.horassync.ui;

import java.util.Scanner;

public class ConsoleUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String lerTexto(String rotulo) {
        String entrada = "";
        while (entrada.trim().isEmpty()) {
            System.out.print(rotulo + ": ");
            entrada = scanner.nextLine();
            if (entrada.trim().isEmpty()) {
                System.out.println("⚠️ O campo não pode ser vazio. Tente novamente.");
            }
        }
        return entrada.trim();
    }

    public static int lerInteiroPositivo(String rotulo) {
        while (true) {
            try {
                System.out.print(rotulo + ": ");
                String input = scanner.nextLine();
                int valor = Integer.parseInt(input);
                if (valor <= 0) {
                    throw new EntradaInvalidaException("O valor deve ser maior que zero.");
                }
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Entrada inválida! Digite apenas números inteiros.");
            } catch (EntradaInvalidaException e) {
                System.out.println("⚠️ " + e.getMessage());
            }
        }
    }
}
