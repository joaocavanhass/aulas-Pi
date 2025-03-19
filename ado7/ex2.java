package ado7;

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número natural: ");
        int num = leitor.nextInt();
        
        long fatorial = 1;
        for (int cont = num; cont > 1; cont--) {
            fatorial *= cont;
        }
        
        System.out.println("O fatorial de " + num + " é " + fatorial);
    }
}

