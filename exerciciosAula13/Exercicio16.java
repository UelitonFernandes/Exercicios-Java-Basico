package exerciciosAula13;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double alturaParede, larguraParede, areaPintada, quantidadeDeLatas, coberturaPorLata, totalAPagar;

        System.out.println("Informe a altura da parede que sera pintada");
        alturaParede = input.nextDouble();
        System.out.println("Informe a largura da parede que sera pintada");
        larguraParede = input.nextDouble();

        areaPintada = alturaParede * larguraParede;
        coberturaPorLata = 18/3;
        quantidadeDeLatas = areaPintada/coberturaPorLata;
        totalAPagar = quantidadeDeLatas * 80;

        System.out.println("Área pintada - " + areaPintada + " m²");
        System.out.println("Cobertura por lata - " + coberturaPorLata + " m²" );
        System.out.printf("Quantidade de latas - %.2f%n", quantidadeDeLatas);
        System.out.printf("Total a pagar - R$ %.2f%n", totalAPagar );

        input.close();
    }
    
}
