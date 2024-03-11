package problema_soma_vetor;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tamanhoVector ;

        System.out.println("Quantos números você vai digitar?");
        tamanhoVector = sc.nextInt();

        double[] vect = new double[tamanhoVector];

        for (int i = 0 ; i < vect.length ; i++){

            System.out.println("Digite um número:");
            double auxAdicionaVector = sc.nextDouble();
            vect[i] = auxAdicionaVector;

        }

        System.out.print("VALORES = ");

        for (int i = 0; i < vect.length; i++) {

            System.out.print(vect[i]);

            if (i < vect.length - 1) {

                System.out.print(" ");

            }

        }

        System.out.println();

        double soma = 0.0;

        for (Double i : vect){

            soma += i;

        }

        System.out.printf("SOMA = %.2f%n", soma);

        System.out.printf("MEDIA = %.2f%n", soma / vect.length);

        sc.close();

    }

}
