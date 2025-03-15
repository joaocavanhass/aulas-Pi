package ado5;

import java.util.*;

public class atividade7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 

        double padrao = 28.50;
        double quarta = 14.25;
        double nacional = 5.00;

        System.out.print("Digite a quantidade de ingressos inteiros: ");
        int inteiras = leitor.nextInt();

        System.out.print("Digite a quantidade de ingressos meias: ");
        int meias = leitor.nextInt();

        System.out.print("Digite o dia da semana: ");
        String dia = leitor.next();

        System.out.print("O filme é nacional?: ");
        boolean filmeNacional = leitor.nextBoolean();

        double precoIngresso;
        if (filmeNacional) {
            precoIngresso = nacional;
        } else if (dia.equals("quarta")) {
            precoIngresso = quarta;
        } else {
            precoIngresso = padrao;
        }

        double quantidade = inteiras + meias;
        double total = (inteiras * precoIngresso) + (meias * (precoIngresso / 2));

        System.out.printf("Total a pagar: R$ %.2f\n", total);
    }
}
