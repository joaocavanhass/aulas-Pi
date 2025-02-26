import java.util.Scanner;

public class atividade17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double acai;

        System.out.println("Digite quantos açais deseja: ");
        acai = leitor.nextDouble();

        double total = acai * 13.5;

        System.out.println("Total a pagar é: R$" + total);
    }
}
