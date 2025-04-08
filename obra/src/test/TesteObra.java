package src.test;

import java.util.Random;
import java.util.Scanner;

import src.model.Obra;

public class TesteObra {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int idObra = random.nextInt(1000);

        System.out.println("\n===========================================");
        System.out.println("   CADASTRO DE OBRA - SISTEMA DE GESTÃO  ");
        System.out.println("===========================================\n");

        System.out.print(" Descrição da Obra: ");
        String descricao = input.nextLine();

        System.out.print(" Valor da Obra (R$): ");
        double valorObra = input.nextDouble();

        Obra obra = new Obra(idObra, descricao, valorObra);

        System.out.println("\n-------------------------------------------");
        System.out.print(" Valor do pagamento inicial (R$): ");
        double valorPago = input.nextDouble();
        System.out.println("-------------------------------------------\n");

        String resultadoPagamento = obra.verificaPagamento(valorPago);
        System.out.println(resultadoPagamento);

        System.out.println(obra.getResumoObra());

        input.close();
    }
}
