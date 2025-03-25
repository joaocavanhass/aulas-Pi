package ado7;

import java.util.*;

public class ex9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe um texto: ");
        String texto = leitor.nextLine();
 
        String textoInvertido = new StringBuilder(texto).reverse().toString();
        
        System.out.println(textoInvertido);
    }
}
