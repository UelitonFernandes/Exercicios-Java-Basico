package exerciciosAula13;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double alturaParede, larguraParede, areaPintada;

        System.out.println("Informe a altura da parede que sera pintada");
        alturaParede = input.nextDouble();
        System.out.println("Informe a largura da parede que sera pintada");
        larguraParede = input.nextDouble();

        double valorLataGrande = 80.00;
        double valorLataPequena = 25.00;
        double capacidadeLataGrande = 18;
        double capacidadeLatapequena = 3.6;
    
        areaPintada = alturaParede * larguraParede;

        input.close();
    }
    
}
