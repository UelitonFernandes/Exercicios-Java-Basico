package exerciciosAula13;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double hourlyRate, hoursWorked, total;

        System.out.println("Informe o valor da sua hora de trabalho :");
        hourlyRate = input.nextDouble();
        System.out.println("Informe por quantas horas você trabalhou este mes :");
        hoursWorked = input.nextDouble();

        total =  hourlyRate * hoursWorked;

        System.out.printf("O total de ganhos este mes foi de %.2f reais %n", total);

        input.close();
    }
    
}
