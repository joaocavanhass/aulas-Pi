package ado7;

import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a base: ");
        int base = leitor.nextInt();

        System.out.print("Informe o expoente: ");
        int expoente = leitor.nextInt();

        if (base < 0 || expoente < 0) {
            System.out.println("Cálculo inválido");
        } else {
            int resultado = 1;

            for (int i = 0; i < expoente; i++) {
                resultado *= base;
            }

            System.out.println(base + " elevado a " + expoente + " é " + resultado);
        }
    }
}
