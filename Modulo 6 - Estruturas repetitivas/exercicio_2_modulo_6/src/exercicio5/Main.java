package exercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nmrFatorialExemplo = sc.nextInt();
        int nmrFatorial = nmrFatorialExemplo;

        for (int i = 1 ; i < nmrFatorialExemplo ; i++){

                nmrFatorial *= i;

        }

        if (nmrFatorialExemplo == 0){

            System.out.println(1);

        } else {

            System.out.println(nmrFatorial);

        }

        sc.close();

    }

}
