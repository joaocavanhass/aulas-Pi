package ado5;

import java.util.*;

public class atividade3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("nota 1: ");
        double n1 = leitor.nextDouble();

        System.out.print("nota 2: ");
        double n2 = leitor.nextDouble();

        System.out.print("nota 3: ");
        double n3 = leitor.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.print("faltas: ");
        int faltas = leitor.nextInt();

        if (faltas > 30) {
            System.out.print("reprovado");
        }
        else {
            if (media >= 8) {
                System.out.print("situação: aprovado com sucesso");
            }
            else if (media >= 6) {
                System.out.print("situação: aprovado");
            }
            else if (media >= 3) {
                System.out.print("situação: recuperação");
            }
            else if (media < 3 && media > 0) {
                System.out.print("situação: reprovado");
            }
            else {
                    System.out.print("situação: desistente");
            }
        }
    }
}
