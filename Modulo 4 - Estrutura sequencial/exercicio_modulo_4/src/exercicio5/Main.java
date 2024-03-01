package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int codPeca1, codPeca2, numPecas1, numPecas2;
        double valorUnitario1, valorUnitario2;

        codPeca1 = entrada.nextInt();
        numPecas1 = entrada.nextInt();
        valorUnitario1 = entrada.nextDouble();
        codPeca2 = entrada.nextInt();
        numPecas2 = entrada.nextInt();
        valorUnitario2 = entrada.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", ((numPecas1 * valorUnitario1) + (numPecas2 * valorUnitario2)));
    }

}
