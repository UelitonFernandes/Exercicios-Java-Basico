package exerciciosAula13;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double primeiroBimestre,segundoBimestre,terceiroBimestre,quartoBimestre;

        System.out.println("Informe a nota do primeiro bimestre :");
        primeiroBimestre = input.nextDouble();
        System.out.println("Informe a nota do segundo bimestre :");
        segundoBimestre = input.nextDouble();
        System.out.println("Informe a nota do terceiro bimestre :");
        terceiroBimestre = input.nextDouble();
        System.out.println("Informe a nota do quarto bimestre :");
        quartoBimestre = input.nextDouble();

        double media = ((primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre)/4);

        System.out.println("A média das suas notas é de : " + media);

        input.close();        
    }
    
}