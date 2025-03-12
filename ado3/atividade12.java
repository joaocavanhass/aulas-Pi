package ado3;
import java.util.Scanner;

public class atividade12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double compra, desconto;

        System.out.println("Digite o valor da compra: ");
        compra = leitor.nextDouble();

        System.out.println("Digite o cupom de desconto: ");
        desconto = leitor.nextDouble();

        double resultado = (desconto / compra) * 100;

        System.out.println("Compra finalizada! O total é de " + resultado);
    }
}
