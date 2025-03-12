package ado5;

import java.util.*;

public class atividade4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("primeiro valor: ");
        double valor1 = leitor.nextDouble();

        System.out.print("segundo valor: ");
        double valor2 = leitor.nextDouble();

        System.out.print("digite a operação: ");
        String operacao = leitor.next();
        
        if (operacao.equalsIgnoreCase("soma")) {
            double soma = valor1 + valor2;
            System.out.print("o resultado é " + soma);
        }
        else if (operacao.equalsIgnoreCase("subtracao")) {
            double subtracao = valor1 - valor2;
            System.out.print("o resultado é " + subtracao);
        }
        else if (operacao.equalsIgnoreCase("multiplicacao")) {
            double multiplicacao = valor1 * valor2;
            System.out.print("o resultado é " + multiplicacao);
        }
        else if (operacao.equalsIgnoreCase("divisao")) {
            double divisao = valor1 / valor2;
            System.out.print("o resultado é " + divisao);
        } 
        else if (operacao.equalsIgnoreCase("resto da divisao")) {
            double resto = valor1 % valor2;
            System.out.print("o resultado é " + resto);
        }
        else if (operacao.equalsIgnoreCase("potencia")) {
            double potencia = Math.pow(valor1, valor2);
            System.out.print("o resultado é " + potencia);
        }
        else {
            System.out.print("operação nao suportada");
        }
        
    }
}