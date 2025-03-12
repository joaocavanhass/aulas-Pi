package ado4;

import java.util.*;

public class atividade9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite sua altura: ");
        double altura = leitor.nextDouble();

        System.out.print("digite seu peso: ");
        double peso = leitor.nextDouble();

        double imc = peso / (altura * altura);

        if (imc >= 40) {
            System.out.println("seu imc é " + imc);
            System.out.print("sua classificação é: obesidade grau 3");
        }
        else if (imc >= 35) {
            System.out.println("seu imc é " + imc);
            System.out.print("sua classificação é: obesidade grau 2");
        }
        else if (imc >= 30) {
            System.out.println("seu imc é " + imc);
            System.out.print("sua classificação é: obesidade grau 1");
        }
        else if (imc >= 25) {
            System.out.println("seu imc é " + imc);
            System.out.print("sua classificação é: sobrepeso");
        }
        else if (imc >= 18.5) {
            System.out.println("seu imc é " + imc);
            System.out.print("sua classificação é: peso normal");
        }
        else {
            System.out.println("seu imc é: " + imc);
            System.out.print("sua classificação é: abaixo do peso");
        }
    }
}
