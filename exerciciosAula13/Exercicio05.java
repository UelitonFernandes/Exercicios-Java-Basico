package exerciciosAula13;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double metros;
        double centimetros;

        System.out.println("Quantos metros você gostaria de converter para centimetros :");
        metros = input.nextDouble();

        centimetros = metros * 100;

        System.out.println("A medida em centimetros para o valor em metros informado e de : " + centimetros + " centimetros");

        input.close();       
    }
    
}
