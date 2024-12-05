package tokens;

import java.util.Scanner;

public class testeT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de token (1: Fungível, 2: Não Fungível): ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        System.out.print("Nome do token: ");
        String nome = scanner.nextLine();

        System.out.print("Valor do token: ");
        double valor = scanner.nextDouble();

        Token token = null;

        if (escolha == 1) {
            System.out.print("Quantidade: ");
            token = new tokenfungivel(nome, valor, scanner.nextInt());
        } else if (escolha == 2) {
            System.out.print("ID único: ");
            token = new tokenNfungivel(nome, valor, scanner.nextLine());
        } else {
            System.out.println("Escolha inválida.");
            return;
        }

        System.out.println("\nDetalhes do Token:");
        System.out.println(token.detalhes());
    }
}