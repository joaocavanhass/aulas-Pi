package ado7;

import java.util.*;

public class ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Professor Lindão: ");

        String mensagem = leitor.nextLine().replace(" ", "").toUpperCase();
        
        System.out.println(String.join("-", mensagem.split("")));
    }
}
