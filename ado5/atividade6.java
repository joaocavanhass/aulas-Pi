package ado5;

import java.util.*;

public class atividade6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double mensalidade = 0.0;
        
        System.out.print("Digite a sigla do curso (SI, ADS, CS, EC, ES): ");
        String curso = leitor.next();
        
        System.out.print("O aluno é isento?: ");
        boolean isento = leitor.nextBoolean();
        
        System.out.print("Digite o percentual de desconto: ");
        double desconto = leitor.nextDouble();
        
        
        if (curso.equalsIgnoreCase("SI")) {
            mensalidade = 550.00;
        }
        else if (curso.equalsIgnoreCase("ADS")) {
            mensalidade = 750.00;
        } 
        else if (curso.equalsIgnoreCase("CS")) {
            mensalidade = 1150.00;
        } 
        else if (curso.equalsIgnoreCase("EC")) {
            mensalidade = 1300.00;
        } 
        else if (curso.equalsIgnoreCase("ES")) {
            mensalidade = 950.00;
        } 
        else {
            System.out.println("Curso inválido!");
        }
        
        
        if (isento) {
            mensalidade = 0.0;
        } else {
            // Aplicação do desconto
            mensalidade -= (mensalidade * (desconto / 100));
        }
        
        System.out.printf("O valor da mensalidade é: R$ %.2f\n", mensalidade);
        
    }
}
