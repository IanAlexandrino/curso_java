package exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nmrEntrada1 = entrada.nextInt();
        int nmrEntrada2 = entrada.nextInt();

        if (nmrEntrada1 < nmrEntrada2){
            if (nmrEntrada2 % nmrEntrada1 == 0){

                System.out.println("Sao multiplos");

            } else{

                System.out.println("Nao sao multiplos");

            }


        } else if (nmrEntrada2 < nmrEntrada1) {

            if (nmrEntrada1 % nmrEntrada2 == 0){

                System.out.println("Sao multiplos");

            } else {

                System.out.println("Nao sao multiplos");

            }

        }

        entrada.close();

    }

}
