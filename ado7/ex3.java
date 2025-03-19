package ado7;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite um numero natural: ");
        int num = leitor.nextInt();

        for (int cont = 2; cont <= num; cont+=2){
            int soma = 0;
            System.out.println("a soma dos numeros pares de 1 a " + num + " é " + (soma += cont));
        }
    }
}
