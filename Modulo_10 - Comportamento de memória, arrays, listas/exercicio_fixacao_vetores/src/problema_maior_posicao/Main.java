package problema_maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int posicaoMaiorValor = 0;
        double maiorValor = 0.0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int tamanhoVector = sc.nextInt();

        double[] vector = new double[tamanhoVector];

        for (int i = 0 ; i < vector.length ; i++){

            System.out.print("Digite um numero: ");
            double auxAddVector = sc.nextDouble();
            vector[i] = auxAddVector;

        }

        for (int i = 0 ; i < vector.length ; i++){

            if (vector[i] > maiorValor){

                maiorValor = vector[i];
                posicaoMaiorValor = i;

            }

        }

        System.out.println("\nMAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaiorValor);

        sc.close();

    }

}
