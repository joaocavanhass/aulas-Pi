package ado4;

import java.util.*;

public class atividade8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite a nota 1: ");
        double nota1 = leitor.nextDouble();
        
        System.out.print("digite a nota 2: ");
        double nota2 = leitor.nextDouble();

        System.out.print("digite a nota 3: ");
        double nota3 = leitor.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 8) {
            System.out.println("a média do aluno é " + media);
            System.out.print("situação: aprovado com sucesso");
        }
        else if (media >= 6) {
            System.out.println("a média do aluno é " + media);
            System.out.print("situação: aprovado");
        }
        else if (media >= 3) {
            System.out.println("a média do aluno é " + media);
            System.out.print("situação: recuperação");
        }
        else if (media < 3 && media > 0) {
            System.out.println("a média do aluno é " + media);
            System.out.print("situação: reprovado");
        }
        else {
                System.out.println("a média do aluno é " + media);
                System.out.print("situação: desistente");
        }
    }
}
