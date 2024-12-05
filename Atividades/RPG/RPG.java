package RPG;

import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do seu personagem: ");
        String nome = scanner.nextLine();

        System.out.println("Escolha uma classe:");
        System.out.println("1. Mago");
        System.out.println("2. Guerreiro");
        System.out.println("3. Sacerdote");
        System.out.println("4. Ladrão");

        int escolha = scanner.nextInt();
        Personagem personagem = null;

        switch (escolha) {
            case 1:
                personagem = new Mago(nome);
                break;
            case 2:
                personagem = new guerreiro(nome);
                break;
            case 3:
                personagem = new sacerdote(nome);
                break;
            case 4:
                personagem = new ladrao(nome);
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }

        System.out.println("\nVocê criou um personagem:");
        personagem.mostrarInfo();
    }
}