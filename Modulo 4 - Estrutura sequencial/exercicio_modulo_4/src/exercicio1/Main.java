package exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int A, B;

        A = entrada.nextInt();
        B = entrada.nextInt();

        System.out.println("SOMA = " + (A+B));
        entrada.close();
    }

}
