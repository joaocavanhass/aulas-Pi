package ado4;

import java.util.*;

public class atividade6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite a quantidade de sorvete: ");
        int compra = leitor.nextInt();
        
        if (compra <= 999 && compra >= 1) {
            double sorvete = 0.035;
            double total = compra * sorvete;
            System.out.print("o valor total é de: " + total);
        }
        else if (compra >= 1000) {
            double sorvete = 0.03;
            double total = compra * sorvete;
            System.out.print("o total é de: " + total);
        }
        else {
            System.out.print("peso inválido");
        }

    }
}
