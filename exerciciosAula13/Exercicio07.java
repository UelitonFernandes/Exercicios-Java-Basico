package exerciciosAula13;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ladoDoQuadrado,areaDoQuadrado,dobroDaAreaDoQuadrado;

        System.out.println("Informe o valor do lado do quadrado em céntimetros :");
        ladoDoQuadrado = input.nextDouble();

        areaDoQuadrado = ladoDoQuadrado * ladoDoQuadrado;

        System.out.printf("O valor da área do quadrado informado e de %.2f cm² %n", areaDoQuadrado);

        dobroDaAreaDoQuadrado = 2 * areaDoQuadrado;

        System.out.printf("E o seu dobro e de %.2f cm² %n", dobroDaAreaDoQuadrado);

        input.close();
    }
    
}
