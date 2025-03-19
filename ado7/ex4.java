package ado7;

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite um número natural: ");
        int num = leitor.nextInt();

        System.out.print("digite outro numero: ");
        int num2 = leitor.nextInt();
        
        int par = 0;
        for (int cont = num; cont <= num2; cont += 2) {
            par += cont;
        }
        
        System.out.println("a soma dos números pares de " + num + " a " + num2 + " é " + par);
    }
}
