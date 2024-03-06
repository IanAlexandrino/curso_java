package exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nmrEntrada = entrada.nextInt();

        if (nmrEntrada < 0){

            System.out.println("NEGATIVO");

        }else if (nmrEntrada > 0) {

            System.out.println("NAO NEGATIVO");

        } else {

            System.out.println("Você digitou o número 0 portanto ele não é nem negativo nem positivo");

        }

        entrada.close();

    }

}
