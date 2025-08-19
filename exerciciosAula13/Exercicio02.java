package exerciciosAula13;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        var numero = 0;

        System.out.println("Informe um número: ");
        numero = input.nextInt();
        System.out.println("O número informado foi: " + numero);

        input.close();
    }
    
}
