package exerciciosAula13;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tamanhoDoArquivo, tempoParaDownload, velocidadeDaRede;

        System.out.println("Informe o tamanho do arquivo em MB : ");
        tamanhoDoArquivo = input.nextDouble();
        System.out.println("Informe a velocidade de download da sua rede em Mbps : ");
        velocidadeDaRede = input.nextDouble();

        tamanhoDoArquivo = tamanhoDoArquivo * 8 * 1000000;
        velocidadeDaRede = velocidadeDaRede * 1000000;
        tempoParaDownload = tamanhoDoArquivo / velocidadeDaRede;

        System.out.println("O tempo aproximado para download e de " + tempoParaDownload + " segundos");

        input.close();
    }
    
}
