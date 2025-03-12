package ado4;

import java.util.*;

public class atividade4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int semana;

        System.out.print("dgite o numero da semana: ");
        semana = leitor.nextInt();

        if (semana == 0) {
            System.out.print("domingo");
        }
        else if (semana == 1) {
            System.out.print("segunda");
        }
        else if (semana == 2) {
            System.out.print("terça");
        }
        else if (semana == 3) {
            System.out.print("quarta");
        }
        else if (semana == 4) {
            System.out.print("quinta");
        }
        else if (semana == 5) {
            System.out.print("sexta");
        }
        else if (semana == 6) {
            System.out.print("sabado");
        }
        else {
            System.out.print("dia da semana invalido");
        }
    }
}