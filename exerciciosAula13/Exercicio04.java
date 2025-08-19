package exerciciosAula13;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double primeiraNota;
        double segundaNota;
        double terceiraNota;
        double quartaNota;

        System.out.println("Informe a nota do primeiro bimestre :");
        primeiraNota = input.nextDouble();
        System.out.println("Informe a nota do segundo bimestre :");
        segundaNota = input.nextDouble();
        System.out.println("Informe a nota do terceiro bimestre :");
        terceiraNota = input.nextDouble();
        System.out.println("Informe a nota do quarto bimestre :");
        quartaNota = input.nextDouble();

        double average = ((primeiraNota + segundaNota + terceiraNota + quartaNota)/4);

        System.out.println("A media das suas notas e de : " + average);

        input.close();        
    }
    
}
