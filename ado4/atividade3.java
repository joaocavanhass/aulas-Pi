package ado4;

import java.util.*;

public class atividade3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double ganhos, gastos;

        System.out.print("digite seus ganhos: ");
        ganhos = leitor.nextDouble();

        System.out.print("digite seus gastos: ");
        gastos = leitor.nextDouble();

        if (ganhos >= gastos) {
            System.out.print("Você está dentro do orçamento!");
        } 
        else {
            System.out.print("Você está fora do orçamento! Não gaste mais!");
        }
    }
}
