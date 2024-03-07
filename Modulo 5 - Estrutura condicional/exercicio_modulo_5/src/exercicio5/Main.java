package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int cod = entrada.nextInt();
        int quantidade = entrada.nextInt();
        double total;

        switch (cod){

            case 1:
                total = 4.00 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;

            case 2:
                total = 4.50 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;

            case 3:
                total = 5.00 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;

            case 4:
                total = 2.00 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;

            case 5:
                total = 1.50 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;

            default:
                System.out.println("Código não existe!");
        }
    }

}
