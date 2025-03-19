package ado6;

import java.util.*;

public class ex9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int num = leitor.nextInt();

        for (int cont = 1; cont <= 10; cont++){
            System.out.println(num + " x " + cont + " = " + (num * cont));
        }
    }
}
