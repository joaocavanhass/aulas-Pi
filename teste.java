import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();
        
        long fatorial = calcularFatorial(numero);
        
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
    
    public static long calcularFatorial(int num) {
        long resultado = 1;
        for (int i = num; i > 1; i--) {
            resultado *= i;
        }
        return resultado;
    }
}
