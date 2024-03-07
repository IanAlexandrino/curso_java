package exercicio6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nmrDivisores = sc.nextInt();

        for (int i = 1 ; i <= 6 ; i++){

            if (nmrDivisores % i == 0){

                System.out.println(i);

            }

        }

        sc.close();

    }

}
