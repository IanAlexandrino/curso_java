package aplicacao;

import entidades.Funcionario;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        int auxChoseId;
        double auxPercentageIncrease;

        System.out.print("How many employees will be registered? ");
        int quantidadeFuncionarios = sc.nextInt();

        for (int i = 0 ; i < quantidadeFuncionarios ; i++){

            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("Id: ");
            int auxId = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String auxNome = sc.nextLine();
            System.out.print("Salary: ");
            double auxSalario = sc.nextDouble();

            funcionarios.add(new Funcionario(auxId, auxNome, auxSalario));

        }

        System.out.print("Enter the employee id that will have salary increase: ");
        auxChoseId = sc.nextInt();

        Funcionario funcionarioId = funcionarios.stream().filter(x -> x.getId() == auxChoseId).findAny().orElse(null);

        if (funcionarioId == null){

            System.out.println("This id does not exist");

        } else {

            System.out.print("Enter the percentage: ");
            auxPercentageIncrease = sc.nextDouble();

            for (Funcionario funcionario : funcionarios){

                if (funcionario.getId() == auxChoseId){

                    double auxSalaryEmployee = funcionario.getSalary();
                    double auxIncreaseSalary = auxSalaryEmployee += (auxPercentageIncrease * funcionario.getSalary()) / 100;

                    funcionario.setSalary(auxIncreaseSalary);

                }

            }

        }

        System.out.println("\nList of employees: ");

        for (Funcionario funcionario : funcionarios){

            System.out.printf(funcionario.getId() + ", " + funcionario.getName() + ", %.2f%n", funcionario.getSalary());

        }

        sc.close();

    }

}
