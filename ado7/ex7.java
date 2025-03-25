package ado7;

import java.util.*;

public class ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe uma mensagem: ");
        String mensagem = leitor.nextLine();
        
        String resultado = mensagem.replaceAll("", "-").substring(1, mensagem.length() * 2 - 1);

        System.out.println(resultado);

    }
}
