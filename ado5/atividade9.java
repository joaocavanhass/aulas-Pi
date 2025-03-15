package ado5;

import java.util.*;

public class atividade9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Random random = new Random();

        System.out.print("Escolha Par ou Ímpar: ");
        String escolha = leitor.nextLine();

        System.out.print("Digite um número entre 1 e 5: ");
        int numero = leitor.nextInt();
        
        if (numero < 1 || numero > 5) {
            System.out.println("Número inválido! Escolha um número entre 1 e 5.");
        }
        
        int maquina = random.nextInt(5) + 1;
        int soma = numero + maquina;
        boolean par = (soma % 2 == 0);

        System.out.println("o jogador pediu " + escolha);
        System.out.println("jogador " + numero + " x " + maquina + " maquina");
        System.out.println("Soma: " + soma);

        if ((escolha == "par" && par) || (escolha == "impar" && !par)) {
            System.out.println("jogador venceu!");
        } else {
            System.out.println("a máquina venceu!");
        }
    }
}
