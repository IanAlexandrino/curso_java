package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double A, B, C, PI;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();
        PI = 3.14159;

        System.out.printf("TRIANGULO: %.3f%n", (A * C / 2));
        System.out.printf("CIRCULO: %.3f%n", (PI * Math.pow(C, 2)));
        System.out.printf("TRAPEZIO: %.3f%n", ((A + B) * C / 2));
        System.out.printf("QUADRADO: %.3f%n", (Math.pow(B, 2)));
        System.out.printf("RETANGULO: %.3f%n", (A * B));

    }

}
