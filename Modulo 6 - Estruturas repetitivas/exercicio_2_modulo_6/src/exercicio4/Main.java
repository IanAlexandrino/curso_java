package exercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qntPares = sc.nextInt();

        for (int i = 0 ; i < qntPares ; i++){

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y != 0){

                System.out.println((float) x / y);


            } else {

                System.out.println("divisao impossivel");

            }

        }

        sc.close();

    }

}
