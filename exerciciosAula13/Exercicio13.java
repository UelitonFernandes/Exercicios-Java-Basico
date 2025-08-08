package exerciciosAula13;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double heigth, idealWeight, weigth;
        String sex;

        System.out.println("Informe a sua altura :");
        heigth = input.nextDouble();
        System.out.println("Informe o seu sexo (masculino M | feminino F) :");
        sex = input.next();

        if(sex.equalsIgnoreCase("M")){
            idealWeight = (72.7 * heigth) - 58;
            System.out.println("O seu peso ideal e : " + idealWeight);
            System.out.println("informe o seu peso :");
            weigth = input.nextDouble();

            if(weigth < idealWeight){
                System.out.println("Você esta abaixo do seu peso ideal");
                }else if(weigth == idealWeight){
                    System.out.println("Você esta no seu peso ideal");
            }else{
                System.out.println("Você esta acima do seu peso ideal");
            }
        }else if(sex.equalsIgnoreCase("F")){
            idealWeight = (62.1 * heigth) - 44.7;
            System.out.println("Seu peso ideal e : " + idealWeight);
            System.out.println("Informe o seu peso : ");
            weigth = input.nextDouble();

             if(weigth < idealWeight){
                System.out.println("Você esta abaixo do seu peso ideal");
                }else if(weigth == idealWeight){
                    System.out.println("Você esta no seu peso ideal");
            }else{
                System.out.println("Você esta acima do seu peso ideal");
            }
        }

        input.close();
    }
    
}
