package exerciciosAula13;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double temperaturaEmFahrenheit, temperaturaEmCelcius;
       
        System.out.println("Informe a temperatura em graus fahrenheit :");
        temperaturaEmFahrenheit = input.nextDouble();
        
        temperaturaEmCelcius = ((5 * (temperaturaEmFahrenheit - 32)) / 9);

        System.out.printf("A temperatura informada em fahrenheit convertida para celcius e igual a : %.2f° graus %n", temperaturaEmCelcius);

        input.close();
    }
    
}
