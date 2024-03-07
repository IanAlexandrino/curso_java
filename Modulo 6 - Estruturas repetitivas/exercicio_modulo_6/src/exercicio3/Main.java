package exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opCombustivel = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (opCombustivel != 4){

            opCombustivel = entrada.nextInt();

            while (opCombustivel < 1 || opCombustivel > 4){

                opCombustivel = entrada.nextInt();

            }

            if (opCombustivel == 1){

                alcool++;

            } else if (opCombustivel == 2) {

                gasolina++;

            } else if (opCombustivel == 3) {

                diesel++;

            }

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        entrada.close();

    }

}
