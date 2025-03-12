package ado5;

import java.util.*;

public class atividade5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite sua nota: ");
        double nota = leitor.nextDouble();

        System.out.print("digite a nota de corte: ");
        double corte = leitor.nextDouble();

        System.out.print("digite a nota minima de aprovação: ");
        double aprovacao = leitor.nextDouble();
        
        if (nota < corte) {
            System.out.print("candidato não passou");
        }
        else if (nota >= aprovacao) {
            System.out.print("candidato aprovado");
        }
        else {
            System.out.print("candidato está na lista de espera");
        }
    }
}
