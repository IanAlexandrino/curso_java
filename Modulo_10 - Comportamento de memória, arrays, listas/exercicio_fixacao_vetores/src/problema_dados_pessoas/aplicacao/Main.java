package problema_dados_pessoas.aplicacao;

import problema_dados_pessoas.entidades.Pessoa;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantidadeHomens = 0;
        int quantidadeMulheres = 0;
        double somaAlturaMulheres = 0.00;
        double menorAltura = 2.40;
        double maiorAltura = 0.00;

        System.out.print("Quantas pessoas serao digitadas? ");
        int tamanhoVector = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[tamanhoVector];

        for (int i = 0 ; i < pessoas.length ; i++){

            System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
            double auxAltura = sc.nextDouble();
            sc.nextLine();
            System.out.print("Genero da " + (i + 1) + "ª pessoa: ");
            String auxGenero = sc.nextLine();

            pessoas[i] = new Pessoa(auxAltura, auxGenero);

        }

        for (Pessoa pessoa : pessoas){

            if (pessoa.getAltura() < menorAltura){

                menorAltura = pessoa.getAltura();

            }

        }

        for (Pessoa pessoa : pessoas){

            if (pessoa.getAltura() > maiorAltura){

                maiorAltura = pessoa.getAltura();

            }

        }

        for (Pessoa pessoa : pessoas){

            if (Objects.equals(pessoa.getGenero(), "F")){

                somaAlturaMulheres += pessoa.getAltura();
                quantidadeMulheres++;

            }

        }

        for (Pessoa pessoa : pessoas){

            if (Objects.equals(pessoa.getGenero(), "M")){

                quantidadeHomens++;

            }

        }

        System.out.printf("Menor Altura = %.2f%n", menorAltura);
        System.out.printf("Maior Altura = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", somaAlturaMulheres / quantidadeMulheres);
        System.out.println("Numero de homens = " + quantidadeHomens);

        sc.close();

    }

}
