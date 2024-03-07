package exercicio7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nmrPositivo = sc.nextInt();

        while (nmrPositivo < 1){

            nmrPositivo = sc.nextInt();

        }

        for (int i = 1 ; i <= nmrPositivo ; i++){

            System.out.println(i + " " + (int) Math.pow(i,2) + " " + (int) Math.pow(i,3));

        }

        sc.close();

    }

}
