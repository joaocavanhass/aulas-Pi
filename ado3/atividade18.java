package ado3;
import java.util.Scanner;

public class atividade18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double pequeno = 13.50; 
        int medio = 15; 
        double  grande = 17.50;

        System.out.println("Pequeno: ");
        pequeno = leitor.nextDouble();

        System.out.println("Médio: ");
        medio = leitor.nextInt();

        System.out.println("Grande: ");
        grande = leitor.nextDouble();

        double total = pequeno + medio + grande;

        System.out.println("Total á pagar é R$" + total);
    }
}
