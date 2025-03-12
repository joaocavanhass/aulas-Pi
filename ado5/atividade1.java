package ado5;

import java.util.*;

public class atividade1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        
        

        System.out.print("digite o valor do primeiro lado: ");
        int valorA = leitor.nextInt();

        System.out.print("digite o valor do segundo lado: ");
        int valorB = leitor.nextInt();

        System.out.print("digite o valor do terceiro lado: ");
        int valorC = leitor.nextInt();

            if (valorA == valorB && valorB == valorC) {
                System.out.print("o tringulo é equilatero");
            } 
            else if ((valorA == valorB) || (valorA == valorC) || (valorB == valorC)) {
                System.out.print("o tringulo é isósceles");
            } 
            else {
                System.out.print("o trinagulo é escaleno");
            }
    }
}