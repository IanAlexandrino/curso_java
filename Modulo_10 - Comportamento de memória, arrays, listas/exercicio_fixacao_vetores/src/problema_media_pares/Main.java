package problema_media_pares;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int tamanhoVector = sc.nextInt();
        int somaNumerosPares = 0;
        int quantidadeNumerosPares = 0;

        int[] vector = new int[tamanhoVector];

        for (int i = 0 ; i < vector.length ; i++){

            System.out.print("Digite um numero: ");
            vector[i] = sc.nextInt();

        }

        for (int i : vector){

            if (i % 2 == 0){

                somaNumerosPares += i;
                quantidadeNumerosPares++;
            }

        }

        double mediaDosPares = (double) somaNumerosPares / quantidadeNumerosPares;
        int[] vectorPar = new int[quantidadeNumerosPares];
        int auxVectorPar = 0;

        for (int i : vector){

            if (i % 2 == 0){

                vectorPar[auxVectorPar] = i;

            }

        }

        System.out.printf(vectorPar.length == 0 ?
                "NENHUM NUMERO PAR " : "MEDIA DOS PARES = %.1f%n", mediaDosPares);


        sc.close();

    }

}
