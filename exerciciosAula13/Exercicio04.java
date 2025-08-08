package exerciciosAula13;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstNote;
        double secondNote;
        double thirdNote;
        double fourthNote;

        System.out.println("Informe a nota do primeiro bimestre :");
        firstNote = input.nextDouble();
        System.out.println("Informe a nota do segundo bimestre :");
        secondNote = input.nextDouble();
        System.out.println("Informe a nota do terceiro bimestre :");
        thirdNote = input.nextDouble();
        System.out.println("Informe a nota do quarto bimestre :");
        fourthNote = input.nextDouble();

        double average = ((firstNote + secondNote + thirdNote + fourthNote)/4);

        System.out.println("A media das suas notas e de : " + average);

        input.close();        
    }
    
}
