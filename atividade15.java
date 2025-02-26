import java.util.Scanner;

public class atividade15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double compra, parcelas;

        System.out.println("Digite o valor da compra: ");
        compra = leitor.nextDouble();

        System.out.println("Digite a quantidade das parcelas: ");
        parcelas = leitor.nextDouble();

        double total = compra / parcelas;

        System.out.println("Sua compra de R$" + compra + "em " + parcelas + "x de R$" + total);
    }    
}
