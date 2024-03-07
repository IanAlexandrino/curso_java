package exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        while (valor < 1 || valor > 1000){

            valor = sc.nextInt();

        }

        for (int i = 1 ; i <= valor ; i++){

            if (i % 2 != 0){

                System.out.println(i);

            }

        }

        sc.close();

    }

}
