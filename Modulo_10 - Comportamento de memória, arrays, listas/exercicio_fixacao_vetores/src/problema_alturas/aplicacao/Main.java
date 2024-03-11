package problema_alturas.aplicacao;

import problema_alturas.entidades.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double somaAltura = 0.0;
        int numeroPessoasMenos16 = 0;

        System.out.print("Quantas pessoas serão digitadas?");
        int tamanhoVector = sc.nextInt();

        Pessoa[] vect = new Pessoa[tamanhoVector];

        for (int i = 0 ; i < vect.length ; i++){

            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            String auxNome = sc.nextLine();
            System.out.print("Idade: ");
            int auxIdade = sc.nextInt();
            System.out.print("Altura: ");
            double auxAltura = sc.nextDouble();
            vect[i] = new Pessoa(auxNome, auxIdade, auxAltura);

        }

        for (Pessoa pessoa : vect){

            somaAltura += pessoa.getAltura();

            if (pessoa.getIdade() < 16){

                numeroPessoasMenos16++;

            }

        }

        Pessoa[] vectPessoaMenos16 = new Pessoa[numeroPessoasMenos16];
        int i = 0;

        for (Pessoa pessoa : vect){

            if (pessoa.getIdade() < 16){

                vectPessoaMenos16[i] = new Pessoa(pessoa.getNome(), pessoa
                        .getIdade(), pessoa.getAltura());

                i++;
            }

        }

        System.out.printf("\nAltura média: %.2f%n", somaAltura / vect.length);
        System.out.println("Pessoas com menos de 16 anos: " + (numeroPessoasMenos16 * 100) / vect.length + "%");

        for (Pessoa pessoa : vectPessoaMenos16){

            System.out.println(pessoa.getNome());

        }

        sc.close();

    }

}
