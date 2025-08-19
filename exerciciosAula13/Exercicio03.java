package exerciciosAula13;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var primeiroNumero = 0;
        var segundoNumero = 0;

        System.out.println("Informe um número:");
        primeiroNumero = input.nextInt();
        System.out.println("Informe outro número:");
        segundoNumero = input.nextInt();

        var sum = primeiroNumero + segundoNumero;
        System.out.println("A soma dos números informados é: " + sum);
        
        input.close();
    }
    
}
