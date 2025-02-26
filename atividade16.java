import java.util.Scanner;

public class atividade16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double tanque, consumo, distancia;

        System.out.println("digite a capacidade do tanque: ");
        tanque = leitor.nextDouble();

        System.out.println("Digite o consumo do veículo: ");
        consumo = leitor.nextDouble();

        System.out.println("Digite a distancia percorrida: ");
        distancia = leitor.nextDouble();

        double paradas = tanque / consumo % distancia;

        System.out.println("Você precisará fazer " + paradas + "paradas");
    }
}
