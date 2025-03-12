package ado3;
import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double real;

        System.out.println("real: ");
        real = leitor.nextDouble();

        double dolar = real / 5.16;

        System.out.println("dolar: " + dolar);
    }
}
