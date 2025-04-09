package vetor;

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite a quantidade de numeros: ");
        int qtd = leitor.nextInt();

        double[] nums = new double[qtd];
        
        for (int pos = qtd-1; pos >=0; pos--) {
            System.out.println("digite o número: ");
            nums[pos] = leitor.nextDouble();
        }

        System.out.println("[[ os números digitados foram: ]]");
        
        for (double item : nums) {
            System.out.println(item);
        }
    }
}
