package exercicio1.aplicacao;

import exercicio1.entidades.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle widht and height: ");

        double auxWidht = sc.nextDouble();
        double auxHeight = sc.nextDouble();

        Rectangle rectangle = new Rectangle(auxWidht, auxHeight);

        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());

        sc.close();

    }
}