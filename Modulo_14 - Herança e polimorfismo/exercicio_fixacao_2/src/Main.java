import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        double totalTaxes = 0.0;

        System.out.print("Enter the number of tax payers: ");
        int numberTaxPayers = sc.nextInt();

        for (int i = 1 ; i <= numberTaxPayers ; i++){

            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            sc.nextLine();
            String personType = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (Objects.equals(personType, "i") || Objects.equals(personType, "I")){

                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                people.add(new PhysicalPerson(name, anualIncome, healthExpenditures));

            } else {

                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                people.add(new LegalPerson(name, anualIncome, numberEmployees));

            }
        }

        System.out.println("\nTAXES PAID: ");

        for (Person person : people){
            System.out.println(person.getName() + ": $ " + String.format("%.2f", person.tax()));
            totalTaxes += person.tax();
        }

        System.out.printf("\nTOTAL TAXES: $ %.2f", totalTaxes);

        sc.close();
    }
}