package ado6;

import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        int num = leitor.nextInt();

        for (int cont = 1; cont <= num; cont++){
            System.out.print(" * ");
        }
    }
}
