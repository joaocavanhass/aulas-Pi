package ado4;

import java.util.*;

public class atividade10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite o dia da semana(em números): ");
        int dia = leitor.nextInt();

        System.out.print("digite a data: ");
        int data = leitor.nextInt();

        System.out.print("digite o mês: ");
        int mes = leitor.nextInt();

        System.out.print("digite o ano: ");
        int ano = leitor.nextInt();

        String[] semana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", 
                               "Quinta-feira", "Sexta-feira", "Sábado"};
        
        String[] mesesAno = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                             "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.printf("Enviado %s, %d de %s de %d%n", semana[dia], data, mesesAno[mes - 1], ano);

    }
}
