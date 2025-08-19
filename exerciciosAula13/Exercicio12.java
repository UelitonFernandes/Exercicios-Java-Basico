package exerciciosAula13;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double altura, pesoIdeal;

        System.out.println("Informe a sua altura :");
        altura = input.nextDouble();

        pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O seu peso ideal e de : " + pesoIdeal + " Kg");

        input.close();
    }
    
}
