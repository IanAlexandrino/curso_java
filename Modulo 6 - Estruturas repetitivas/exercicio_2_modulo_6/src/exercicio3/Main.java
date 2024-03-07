package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int nmrCasos = sc.nextInt();

        for (int i = 0 ; i < nmrCasos ; i++){

            float nmr1 = sc.nextFloat();
            float nmr2 = sc.nextFloat();
            float nmr3 = sc.nextFloat();

            float resultado = (nmr1 * 2 + nmr2 * 3 + nmr3 * 5) / 10;

            System.out.printf("%.1f%n", resultado);

        }

        sc.close();

    }

}
