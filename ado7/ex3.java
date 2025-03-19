package ado7;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número natural: ");
        int num = leitor.nextInt();
        
        int par = 0;
        for (int cont = 2; cont <= num; cont += 2) {
            par += cont;
        }
        
        System.out.println("A soma dos números pares de 1 a " + num + " é " + par);
    }
}
