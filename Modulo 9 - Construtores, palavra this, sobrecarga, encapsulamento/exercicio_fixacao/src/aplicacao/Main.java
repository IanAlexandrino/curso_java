package aplicacao;

import entidades.Conta;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;
        int auxNumeroConta;
        String auxNomeConta, auxEscolhaInicial;
        double auxValorDeposito;

        System.out.println("Enter account number:");
        auxNumeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder:");
        auxNomeConta = sc.nextLine();

        System.out.println("Is there a initial deposit (y/n)?");
        auxEscolhaInicial = sc.nextLine();

        if (Objects.equals(auxEscolhaInicial, "y")){

            System.out.println("Enter initial deposit value:");
            auxValorDeposito = sc.nextDouble();
            conta = new Conta(auxNumeroConta, auxNomeConta, auxValorDeposito);

        } else {

            conta = new Conta(auxNumeroConta, auxNomeConta);

        }

        System.out.println("\nAccount data:");
        System.out.println(conta);

        System.out.println("\nEnter a deposit value");
        System.out.println(conta.deposito(auxValorDeposito = sc.nextDouble()));

        System.out.println("\nEnter a withdraw value:");
        System.out.println(conta.saque(auxValorDeposito = sc.nextDouble()));

        sc.close();

    }
}