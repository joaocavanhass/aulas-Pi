package ado4;

import java.util.*;

public class atividade2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite como esta o semaforo: ");
        String semaforo = leitor.nextLine();

        if (semaforo.equalsIgnoreCase("vermelho")) {
            System.out.print("espere");
        }
        else if (semaforo.equalsIgnoreCase("verde")) {
            System.out.print("atravesse");
        }
        else {
            System.out.print("farol inoperante");
        }
    }
}
