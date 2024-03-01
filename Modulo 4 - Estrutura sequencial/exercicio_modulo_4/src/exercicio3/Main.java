package exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int A, B, C, D;

        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();

        System.out.println("DIFERENCA = " + (A * B - C * D));
    }

}
