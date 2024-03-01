package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int numFuncionario, horasTrabalhadas;
        double valorHora;

        numFuncionario = entrada.nextInt();
        horasTrabalhadas = entrada.nextInt();
        valorHora = entrada.nextDouble();

        System.out.printf("NUMBER = " + numFuncionario + "\n" +
                "SALARY = U$ %.2f%n", valorHora * horasTrabalhadas);
    }

}
