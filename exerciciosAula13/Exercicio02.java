package exerciciosAula13;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        var number = 0;

        System.out.println("Informe um número: ");
        number = input.nextInt();
        System.out.println("O número informado foi: " + number);

        input.close();
    }
    
}
