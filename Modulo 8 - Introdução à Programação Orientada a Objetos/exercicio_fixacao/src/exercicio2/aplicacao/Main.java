package exercicio2.aplicacao;

import exercicio2.entidades.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String auxName = sc.nextLine();
        double auxGrossSalary = sc.nextDouble();
        double auxTax = sc.nextDouble();
        double auxPercentage;

        Employee employee = new Employee(auxName, auxGrossSalary, auxTax);

        System.out.printf("Employee: " + employee.getName() + ", $ %.2f%n", employee.netSalary());

        System.out.println("Which percentage to increase salary? ");
        auxPercentage = sc.nextDouble();

        employee.increaseSalary(auxPercentage);

        sc.close();

    }

}
