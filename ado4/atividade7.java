package ado4;

import java.util.*;

public class atividade7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double temperatura;

        System.out.print("digite sua temperatura: ");
        temperatura = leitor.nextDouble();

        if (temperatura >= 41) {
            System.out.print("hipertemia");
        }
        else if (temperatura < 41 && temperatura >= 39.6) {
            System.out.print("febre alta");
        }
        else if (temperatura < 39.6 && temperatura >= 37.6) {
            System.out.print("febre");
        }
        else if (temperatura < 37.6 && temperatura >= 36) {
            System.out.print("normal");
        }
        else {
            System.out.print("hipotermia");
        }
    }
}
