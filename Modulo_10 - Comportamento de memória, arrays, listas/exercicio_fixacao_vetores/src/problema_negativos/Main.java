package problema_negativos;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tamanhoVector ;

        System.out.println("Quantos números você vai digitar(Max: 10)?");
        tamanhoVector = sc.nextInt();

        while(tamanhoVector > 10 || tamanhoVector < 1){

            if (tamanhoVector > 10){

                System.out.println("Você só pode digitar no máximo 10 números, tente novamente:");

            } else {

                System.out.println("Você tem que digitar mais de 1 número, tente novamente:");

            }

            tamanhoVector = sc.nextInt();

        }

        int[] vect = new int[tamanhoVector];

        for (int i = 0 ; i < vect.length ; i++){

            System.out.println("Digite um número:");
            int auxAdicionaVector = sc.nextInt();
            vect[i] = auxAdicionaVector;

        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (Integer i : vect){

            if (i < 0){

                System.out.println(i);

            }


        }

        sc.close();

    }

}
