package ado5;

import java.util.*;

public class atividade2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite a primeira cor primária: ");
        String cor1 = leitor.nextLine();

        System.out.print("digite a segunda cor primária: ");
        String cor2 = leitor.nextLine();

        if (!(cor1.equals("vermelho") || cor1.equals("azul") || cor1.equals("amarelo")) ||
            !(cor2.equals("vermelho") || cor2.equals("azul") || cor2.equals("amarelo"))) {
            System.out.println("a combinação de cores é: apenas cores primárias são aceitas.");
        }
         if (cor1.equals(cor2)) {
            System.out.println("A cor resultante é " + cor1 + ".");
        }

        String mistura = "";

            if ((cor1.equals("vermelho") && cor2.equals("azul")) || (cor1.equals("azul") && cor2.equals("vermelho"))) {
                mistura = "roxo";
                System.out.println("a combinação das cores é: " + mistura);
            } 
            else if ((cor1.equals("vermelho") && cor2.equals("amarelo")) || (cor1.equals("amarelo") && cor2.equals("vermelho"))) {
                mistura = "laranja";
                System.out.println("a combinação das cores é: " + mistura);
            } 
            else if ((cor1.equals("azul") && cor2.equals("amarelo")) || (cor1.equals("amarelo") && cor2.equals("azul"))) {
                mistura = "verde";
                System.out.println("a combinação das cores é: " + mistura);
            }
            
        }
    }

