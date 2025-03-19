package ado6;

import java.util.*;

public class ex5 {
     public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int num = leitor.nextInt();

        System.out.println("digite o segundo numero: ");
        int num2 = leitor.nextInt();

        for (int cont = num; cont <= num2; cont+=2){
            System.out.println(cont);
        }
    }
}
