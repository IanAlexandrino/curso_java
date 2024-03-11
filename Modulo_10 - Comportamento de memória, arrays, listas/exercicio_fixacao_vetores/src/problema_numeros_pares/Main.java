package problema_numeros_pares;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quantidadePares = 0;

        System.out.print("Quantos números você vai digitar? ");
        int tamanhoVector = sc.nextInt();

        int[] vector = new int[tamanhoVector];

        for (int i = 0 ; i < vector.length ; i++){

            System.out.print("Digite um número: ");
            int auxAddVector = sc.nextInt();
            vector[i] = auxAddVector;

        }

        System.out.println("NUMEROS PARES: ");

        for (int i : vector){

            if (i % 2 == 0){

                quantidadePares++;
                System.out.print(i + " ");

            }

        }

        System.out.println("\n");

        System.out.println("QUANTIDADE DE PARES = " + quantidadePares);

        sc.close();

    }

}
