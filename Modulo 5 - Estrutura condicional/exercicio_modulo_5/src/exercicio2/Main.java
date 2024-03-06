package exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nmrEntrada = entrada.nextInt();

        if ((nmrEntrada * nmrEntrada) % 2 == 0){

            System.out.println("PAR");

        } else if ((nmrEntrada * nmrEntrada) % 2 == 1) {

            System.out.println("IMPAR");

        }

        entrada.close();

    }

}
