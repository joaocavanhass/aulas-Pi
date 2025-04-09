package vetor;

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int pos = 0; pos < nomes.length; pos++) {
            System.out.println("digite os nomes: ");
            nomes[pos] = leitor.nextLine();
        }
        System.out.println("os nomes digitados foram: ");
        for (String item : nomes) {
            System.out.println(item);
        }
    }
}
