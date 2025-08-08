package exerciciosAula13;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fishWeight, overFish, fineValue;

        System.out.println("Informe a quantidade de peixe de hoje :");
        fishWeight = input.nextDouble();

        overFish = fishWeight - 50;

        if(fishWeight > 50){
           fineValue = overFish * 4.0;
           System.out.println("Infelizmente a quantidade de peixe de hoje ultrapassou o limite permitido");
           System.out.printf("%-16s %-2s %-9s %-2s %-15s%n", "Quantidade Total", "|", "Escedente", "|", "Valor da Multa");
           System.out.printf("%-16f %-2s %-9f %-2s %-15f%n", fishWeight, "|", overFish, "|", fineValue);
        }else if(fishWeight <= 50){
            fineValue = 0;
            overFish = 0;
            System.out.println("A quantidade de peixe de hoje não ultrapassou o limite permitido");
            System.out.printf("%-16s %-2s %-9s %-2s %-15s%n", "Quantidade Total", "|", "Escedente", "|", "Valor da Multa");
            System.out.printf("%-16f %-2s %-9f %-2s %-15f%n", fishWeight, "|", overFish, "|", fineValue);
        }

        input.close();
    }
    
}
