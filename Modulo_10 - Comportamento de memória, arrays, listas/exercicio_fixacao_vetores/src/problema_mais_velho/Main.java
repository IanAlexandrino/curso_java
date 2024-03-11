package problema_mais_velho;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int tamanhoVectors = sc.nextInt();
        int idadeMaisVelho = 0;

        String[] vectorNome = new String[tamanhoVectors];
        int[] vectorIdade = new int[tamanhoVectors];

        for (int i = 0 ; i < tamanhoVectors ; i++){

            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "ª pessoa");
            System.out.print("Nome: ");
            vectorNome[i] = sc.nextLine();
            System.out.print("Idade: ");
            vectorIdade[i] = sc.nextInt();

        }

        for (int i = 0 ; i < tamanhoVectors ; i++){

            if (vectorIdade[i] > idadeMaisVelho){

                idadeMaisVelho = vectorIdade[i];

            }

        }

        for (int i = 0 ; i < tamanhoVectors ; i++){

            if (vectorIdade[i] == idadeMaisVelho){

                System.out.println("PESSOA MAIS VELHA : " + vectorNome[i]);

            }

        }

        sc.close();

    }

}
