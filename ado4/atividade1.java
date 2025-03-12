package ado4;

import java.util.*;

class atividade1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Tipo do ingresso (meia/inteira):");
        String tipo = leitor.nextLine();

        System.out.println("\nQtd. de ingressos:");
        int quantidade = leitor.nextInt();

        if (tipo.equals("inteira")) {
            double total = quantidade * 28.50;
            System.out.printf("\nO total é R$ %.2f \n", total);
        }
        else if (tipo.equals("meia")) {
            double total = (quantidade * 28.50) / 2;
            System.out.printf("\nO total é R$ %.2f \n", total);
        }
        else {
            System.out.println("\nInválido.");
        }

        
        
    }
}