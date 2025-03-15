package ado5;

import java.util.*;

public class atividade10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Random random = new Random();

        System.out.println("joo-kenn-poo");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.print("escolha: ");
        int escolha = leitor.nextInt();

        if (escolha < 1 || escolha > 3) {
            System.out.println("Jogada inválida! Escolha um número entre 1 e 3.");
        }
        
        int maquina = random.nextInt(3) + 1;

        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        System.out.println("jogador " + opcoes[escolha - 1] + " x " + opcoes[maquina - 1] + " maquina");

        if (escolha == maquina) {
            System.out.println("Empate!");
        } else if ((escolha == 1 && maquina == 3) ||
                   (escolha == 2 && maquina == 1) ||
                   (escolha == 3 && maquina == 2)) {
            System.out.println("o jogador venceu!");
        } else {
            System.out.println("a máquina venceu!");
        }
    }
}
