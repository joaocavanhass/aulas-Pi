package ado7;

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número de início: ");
        int inicio = leitor.nextInt();
        
        System.out.print("Digite o número de fim: ");
        int fim = leitor.nextInt();
        
        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        
        System.out.println("A soma dos números pares de " + inicio + " a " + fim + " é " + soma);
        
    }
}
