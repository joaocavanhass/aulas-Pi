package ado6;

import java.util.*;

public class ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite a altura: ");
        int altura = leitor.nextInt();

        System.out.print("digite a base: ");
        int base = leitor.nextInt();

        for (int cont = 1; cont <= altura; cont++){
            for (int cont2 = 1; cont2 <= base; cont2++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
