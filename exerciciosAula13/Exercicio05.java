package exerciciosAula13;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double metros,centimetros;

        System.out.println("Quantos metros você gostaria de converter para centímetros :");
        metros = input.nextDouble();

        centimetros = metros * 100;

        System.out.println("A médida em centímetros para o valor em metros informado é de : " + centimetros + " centímetros");

        input.close();       
    }
    
}