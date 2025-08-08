package exerciciosAula13;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperatureInFahrenheit, temperatureInCelcius;

        System.out.println("Informe a temperatura em graus celcius :");
        temperatureInCelcius = input.nextDouble();
        
        temperatureInFahrenheit = ((temperatureInCelcius * 9)/5) + 32;

        System.out.printf("A temperatura informada em celcius convertida para fahrenheit e de %.2f° graus",temperatureInFahrenheit);

        input.close();
    }
    
}
