package ado7;

import java.util.*;

class ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número múltiplo: ");
        int multiplo = leitor.nextInt();
        
        System.out.print("Digite o número de início: ");
        int inicio = leitor.nextInt();
        
        System.out.print("Digite o número de fim: ");
        int fim = leitor.nextInt();
        
        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            if (i % multiplo == 0) {
                soma += i;
            }
        }
        
        System.out.println("A soma dos números múltiplos de " + multiplo + ", de " + inicio + " a " + fim + " é " + soma);
    }
}