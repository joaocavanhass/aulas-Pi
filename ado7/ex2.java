package ado7;

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int num = leitor.nextInt();

        for (int cont = 1; cont <= num; cont++){
            System.out.println("o fatorial de " + num + " é " );
        }
    }
}
