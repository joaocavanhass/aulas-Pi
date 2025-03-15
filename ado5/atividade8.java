package ado5;

import java.util.*;

public class atividade8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.print("Digite o total de ganhos: ");
        double ganhos = leitor.nextDouble();

        System.out.print("Digite o total de gastos: ");
        double gastos = leitor.nextDouble();

        double orcamento = (gastos / ganhos) * 100;
        
        String situacao;

        if (gastos > ganhos) {
            situacao = "Orçamento comprometido! Hora de rever seus gastos!";
        } else if (orcamento >= 81) {
            situacao = "Cuidado, seu orçamento pode ficar comprometido!";
        } else if (orcamento >= 51) {
            situacao = "Atenção, melhor conter os gastos!";
        } else if (orcamento >= 21) {
            situacao = "Muito bem, seus gastos não ultrapassam metade dos ganhos!";
        } else {
            situacao = "Parabéns, está gerenciando bem seu orçamento!";
        }
        System.out.print(situacao);
    }

}
