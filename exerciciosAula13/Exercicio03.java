package exerciciosAula13;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var number1 = 0;
        var number2 = 0;

        System.out.println("Informe um número:");
        number1 = input.nextInt();
        System.out.println("Informe outro número:");
        number2 = input.nextInt();

        var sum = number1 + number2;
        System.out.println("A soma dos números informados é: " + sum);
        
        input.close();
    }
    
}
