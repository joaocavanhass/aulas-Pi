import java.util.Scanner;

public class atividade13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double kilos;

        System.out.println("Digite o kilo: ");
        kilos = leitor.nextDouble();

        double gramas = kilos * 1000;

        System.out.println("gramas: " + gramas);
    }
}
