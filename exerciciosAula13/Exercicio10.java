package exerciciosAula13;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperaturaEmFahrenheit,temperaturaEmCelcius;

        System.out.println("Informe a temperatura em graus Celsius :");
        temperaturaEmCelcius = input.nextDouble();
        
        temperaturaEmFahrenheit = ((temperaturaEmCelcius * 9)/5) + 32;

        System.out.printf("A temperatura informada em Celsius convertida para Fahrenheit é de %.2f° graus",temperaturaEmFahrenheit);

        input.close();
    }
    
}
