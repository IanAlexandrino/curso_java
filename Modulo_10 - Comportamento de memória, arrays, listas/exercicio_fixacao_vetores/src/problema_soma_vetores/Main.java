package problema_soma_vetores;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quanros valores vai ter cada vetor? ");
        int tamanhoVectors = sc.nextInt();

        int[] vectorA = new int[tamanhoVectors];
        int[] vectorB = new int[tamanhoVectors];
        int[] vectorResultante = new int[tamanhoVectors];

        System.out.println("Digite os valores do vetor A: ");

        for (int i = 0 ; i < tamanhoVectors ; i++){

            int auxVectorA = sc.nextInt();
            vectorA[i] = auxVectorA;

        }

        System.out.println("Digite os valores do vetor b: ");

        for (int i = 0 ; i < tamanhoVectors ; i++){

            int auxVectorB = sc.nextInt();
            vectorB[i] = auxVectorB;

        }

        System.out.println("VETOR RESULTANTE: ");

        for (int i = 0 ; i < tamanhoVectors ; i++){

            vectorResultante[i] = vectorA[i] + vectorB[i];
            System.out.println(vectorResultante[i]);
        }

        sc.close();

    }

}
