package exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        float salario = entrada.nextFloat();
        float impostoRenda;

        if (salario >= 0 && salario <= 2000.00){

            System.out.println("Isento");

        } else {

            if (salario >= 2000.01 && salario <= 3000.00){

                impostoRenda = (8 * (salario - 2000)) / 100;
                System.out.printf("R$ %.2f%n", impostoRenda);

            } else if (salario >= 3000.01 && salario <= 4500.00) {

                impostoRenda = ((18 * ((salario - 2000) - 1000)) / 100) + 80;
                System.out.printf("R$ %.2f%n", impostoRenda);

            } else if (salario >= 4500.01) {

                impostoRenda = (((28 * (((salario - 2000) - 1000) - 1500)) / 100) + 80) + 270;
                System.out.printf("R$ %.2f%n", impostoRenda);

            }

        }

        entrada.close();

    }

}
