package ado4;

import java.util.*;

public class atividade5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int mes;

        System.out.print("digite o numero do mês: ");
        mes = leitor.nextInt();

        if (mes == 1) {
            System.out.print("janeiro");
        }
        else if (mes == 2) {
            System.out.print("fevereiro");
        }
        else if (mes == 3) {
            System.out.print("março");
        }
        else if (mes == 4) {
            System.out.print("abril");
        }
        else if (mes == 5) {
            System.out.print("maio");
        }
        else if (mes == 6) {
            System.out.print("junho");
        }
        else if (mes == 7) {
            System.out.print("julho");
        }
        else if (mes == 8) {
            System.out.print("agosto");
        }
        else if (mes == 9) {
            System.out.print("setembro");
        }
        else if (mes == 10) {
            System.out.print("outubro");
        }
        else if (mes == 11) {
            System.out.print("novembro");
        }
        else if (mes == 12) {
            System.out.print("dezembro");
        }
        else {
            System.out.print("mês inválido");
        }
    }
}
