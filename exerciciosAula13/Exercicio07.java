package exerciciosAula13;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double squareSide, squareArea, squareArea2X;

        System.out.println("Informe o valor do lado do quadrado em céntimetros :");
        squareSide = input.nextDouble();

        squareArea = squareSide * squareSide;

        System.out.printf("O valor da area do quadrado informado e de %.2f cm² %n", squareArea);

        squareArea2X = 2 * squareArea;

        System.out.printf("E o seu dobro e de %.2f cm² %n", squareArea2X);

        input.close();
    }
    
}
