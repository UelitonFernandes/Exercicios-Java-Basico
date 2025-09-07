package exerciciosAula13;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double primeiroNumero,segundoNumero,terceiroNumero,primeiroResultado,segundoResultado,terceiroResultado;

        System.out.println("Informe o primeiro número");
        primeiroNumero = input.nextDouble();
        System.out.println("Informe o segundo número");
        segundoNumero = input.nextDouble();
        System.out.println("Informe o terceiro número");
        terceiroNumero = input.nextDouble();

        primeiroResultado = (2 * primeiroNumero) + (segundoNumero / 2);
        segundoResultado = (3 * primeiroNumero) + terceiroNumero;
        terceiroResultado = Math.pow(terceiroNumero, 3);

        System.out.println("O resultado da soma do dobro do primeiro número com metade do segundo é igual a : " + primeiroResultado);
        System.out.println("O resultado da soma do triplo do primeiro número com o terceiro número é igual a : " + segundoResultado);
        System.out.println("O resultado da soma do terceiro número elevado ao cubo é igual a : " + terceiroResultado);

        input.close();
    }
    
}
