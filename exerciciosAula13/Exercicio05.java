package exerciciosAula13;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double meters;
        double centimeters;

        System.out.println("Quantos metros você gostaria de converter para centimetros :");
        meters = input.nextDouble();

        centimeters = meters * 100;

        System.out.println("A medida em centimetros para o valor em metros informado e de : " + centimeters + " centimetros");

        input.close();       
    }
    
}
