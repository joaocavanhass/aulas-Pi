package vetor;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        
        int[] nums = new int[5];

        for (int pos = 0; pos < nums.length; pos++) {
            System.out.print("digite um número: ");
            nums[pos] = leitor.nextInt();
        }
        System.out.println("os numeros digitados foram: ");
        
        for (double pos : nums) {
            System.out.println(pos);
        }
        
        
        
    }
}
