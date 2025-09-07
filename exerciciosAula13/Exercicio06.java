package exerciciosAula13;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raioDoCirculo;

        System.out.println("Informe o tamanho do raio do circulo em centímetros :");
        raioDoCirculo = input.nextDouble();

        double circleArea = Math.PI *(raioDoCirculo * raioDoCirculo);

        System.out.printf("A area deste círculo e de : %.2f cm² %n", circleArea);

        input.close();
    }
}