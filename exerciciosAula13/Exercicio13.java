package exerciciosAula13;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double altura,pesoIdeal,peso;
        String sexo;

        System.out.println("Informe a sua altura :");
        altura = input.nextDouble();
        System.out.println("Informe o seu sexo (masculino M | feminino F) :");
        sexo = input.next();

        if(sexo.equalsIgnoreCase("M")){
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O seu peso ideal e : " + pesoIdeal);
            System.out.println("Informe o seu peso :");
            peso = input.nextDouble();

            if(peso < pesoIdeal){
                System.out.println("Você esta abaixo do seu peso ideal");
                }else if(peso == pesoIdeal){
                    System.out.println("Você esta no seu peso ideal");
            }else{
                System.out.println("Você esta acima do seu peso ideal");
            }
        }else if(sexo.equalsIgnoreCase("F")){
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal e : " + pesoIdeal);
            System.out.println("Informe o seu peso : ");
            peso = input.nextDouble();

             if(peso < pesoIdeal){
                System.out.println("Você esta abaixo do seu peso ideal");
                }else if(peso == pesoIdeal){
                    System.out.println("Você esta no seu peso ideal");
            }else{
                System.out.println("Você esta acima do seu peso ideal");
            }
        }

        input.close();
    }
    
}