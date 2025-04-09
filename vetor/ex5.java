package vetor;

import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] nums = new int[10];

            System.out.print("digite um numero: ");
            int numero = leitor.nextInt();
       
        for (int item : nums){
            double vzs = numero * nums;
            System.out.println(vzs);
        }
        
        }
    }

