package exercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int hrInicio = entrada.nextInt();
        int hrFinal = entrada.nextInt();
        int duracao;

        if (hrInicio > hrFinal){

            duracao = 24 - hrInicio + hrFinal;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        } else if (hrInicio == hrFinal) {

            System.out.println("O JOGO DUROU 24 HORA(S)");

        } else {

            duracao = hrFinal - hrInicio;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        }

        entrada.close();

    }

}
