package exercicio1.aplicacao;

import exercicio1.entidades.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double auxValorDolar, auxDolarComprado;

        System.out.println("What is the price?");
        auxValorDolar = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        auxDolarComprado = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.converterDollar(auxValorDolar, auxDolarComprado));

        sc.close();

    }

}
