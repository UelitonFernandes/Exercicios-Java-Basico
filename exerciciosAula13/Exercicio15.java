package exerciciosAula13;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorHora, horasTrabalhadas;
        double inss, sindicato, impostoRenda, salarioBruto, descontos, salarioLiquido;

        System.out.println("Qual o valor da sua hora trabalhada ?");
        valorHora = input.nextDouble();
        System.out.println("Por quantas horas você trabalhou este mês ?");
        horasTrabalhadas = input.nextDouble();

        salarioBruto = valorHora * horasTrabalhadas;
        inss = (8 * salarioBruto)/100;
        impostoRenda = (11 * salarioBruto)/100;
        sindicato = (5 * salarioBruto)/100;
        descontos = (inss + impostoRenda + sindicato);
        salarioLiquido = salarioBruto - descontos;

        System.out.printf("Salário bruto - R$ %.2f%n",salarioBruto);
        System.out.printf("INSS - R$ %.2f%n",inss);
        System.out.printf("Sindicato - R$ %.2f%n",sindicato);
        System.out.printf("IRRF - R$ %.2f%n",impostoRenda);
        System.out.printf("Total de Descontos - R$ %.2f%n",descontos);
        System.out.printf("Salário Líquido - R$ %.2f%n",salarioLiquido);

        input.close();
    }
}