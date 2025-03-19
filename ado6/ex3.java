package ado6;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int num = leitor.nextInt();

        System.out.println("digite o segundo numero: ");
        int num2 = leitor.nextInt();

        for (int cont = num; cont <= num2; cont++){
            System.out.println(cont);
        }
    }
}
