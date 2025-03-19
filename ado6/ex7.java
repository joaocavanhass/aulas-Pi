package ado6;

import java.util.*;

public class ex7 {
     public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        int num = leitor.nextInt();

        for (int cont = 0; cont < num; cont++){
            for (int quadrado = 0; quadrado < num; quadrado++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
