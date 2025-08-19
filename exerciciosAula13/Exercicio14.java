package exerciciosAula13;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pesoDoPeixe, excessoDePeixe, valorDaMulta;

        System.out.println("Informe a quantidade de peixe de hoje :");
        pesoDoPeixe = input.nextDouble();

        excessoDePeixe = pesoDoPeixe - 50;

        if(pesoDoPeixe > 50){
           valorDaMulta = excessoDePeixe * 4.0;
           System.out.println("Infelizmente a quantidade de peixe de hoje ultrapassou o limite permitido");
           System.out.printf("%-16s %-2s %-9s %-2s %-15s%n", "Quantidade Total", "|", "Escedente", "|", "Valor da Multa");
           System.out.printf("%-16f %-2s %-9f %-2s %-15f%n", pesoDoPeixe, "|", excessoDePeixe, "|", valorDaMulta);
        }else if(pesoDoPeixe <= 50){
            valorDaMulta = 0;
            excessoDePeixe = 0;
            System.out.println("A quantidade de peixe de hoje não ultrapassou o limite permitido");
            System.out.printf("%-16s %-2s %-9s %-2s %-15s%n", "Quantidade Total", "|", "Escedente", "|", "Valor da Multa");
            System.out.printf("%-16f %-2s %-9f %-2s %-15f%n", pesoDoPeixe, "|", excessoDePeixe, "|", valorDaMulta);
        }

        input.close();
    }
    
}
