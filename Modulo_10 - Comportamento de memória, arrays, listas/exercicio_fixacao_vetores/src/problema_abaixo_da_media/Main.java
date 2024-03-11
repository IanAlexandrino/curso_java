package problema_abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double somaElementosVetor = 0.0;
        int quantidadeElementosAbaixoMedia = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int tamanhoVector = sc.nextInt();

        double[] vector = new double[tamanhoVector];

        for (int i = 0 ; i < vector.length ; i++){

            System.out.print("Digite um numero: ");
            vector[i] = sc.nextDouble();
            somaElementosVetor += vector[i];

        }

        double mediaVetor = somaElementosVetor / vector.length;

        for (double i : vector){

            if (i < mediaVetor){

                quantidadeElementosAbaixoMedia++;

            }

        }

        double[] vectorAbaixoMedia = new double[quantidadeElementosAbaixoMedia];
        int auxVectorAbaixoMedia = 0;

        for (double i : vector){

            if (i < mediaVetor){

                vectorAbaixoMedia[auxVectorAbaixoMedia] = i;
                auxVectorAbaixoMedia++;

            }

        }

        System.out.printf("\nMEDIA DO VETOR = %.3f%n", mediaVetor);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (double i : vectorAbaixoMedia){

            System.out.println(i);

        }

        sc.close();

    }

}
