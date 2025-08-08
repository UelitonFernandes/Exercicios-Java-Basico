package exerciciosAula13;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double height, idealWeight;

        System.out.println("Informe a sua altura :");
        height = input.nextDouble();

        idealWeight = (72.7 * height) - 58;

        System.out.println("O seu peso ideal e de : " + idealWeight + " Kg");

        input.close();
    }
    
}
