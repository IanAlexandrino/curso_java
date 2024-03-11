package problema_aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int tamanhoVectors = sc.nextInt();

        String[] nomeAlunos = new String[tamanhoVectors];
        double[] notasPrimeiroSemestre = new double[tamanhoVectors];
        double[] notasSegundoSemestre = new double[tamanhoVectors];
        double[] mediaAlunos = new double[tamanhoVectors];

        for (int i = 0 ; i < tamanhoVectors ; i++){

            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "° aluno: ");
            nomeAlunos[i] = sc.nextLine();
            notasPrimeiroSemestre[i] = sc.nextDouble();
            notasSegundoSemestre[i] = sc.nextDouble();

        }

        for (int i = 0 ; i < tamanhoVectors ; i++){

            mediaAlunos[i] = (notasPrimeiroSemestre[i] + notasSegundoSemestre[i]) / 2;

        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0 ; i < tamanhoVectors ; i++){

            if (mediaAlunos[i] >= 6.0){

                System.out.println(nomeAlunos[i]);

            }

        }

        sc.close();

    }

}
