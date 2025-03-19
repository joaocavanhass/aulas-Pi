package ado7;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite um numero natural: ");
        int num = leitor.nextInt();

        for (int cont = 1; cont <= num; cont++){
            System.out.println("A soma dos números de 1 a " + num + " é " + num * (num + 1) / 2);
        }
    }
}
