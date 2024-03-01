package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double raioCirculo, areaCirculo;

        raioCirculo = entrada.nextDouble();
        areaCirculo = 3.14159 * Math.pow(raioCirculo, 2);

        System.out.printf("ÁREA = %.4f%n", areaCirculo);
    }

}
