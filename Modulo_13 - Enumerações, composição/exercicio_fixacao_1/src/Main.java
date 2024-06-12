import entities.Department;
import entities.HourContract;
import entities.worker.Worker;
import entities.worker.WorkerLevel;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Worker worker = new Worker();
        Scanner sc = new Scanner(System.in);
        String workerLevel;
        int numberWorkerContracts;

        System.out.print("Enter department's name: ");
        Department department = new Department(sc.nextLine());
        worker.setDepartment(department);

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        worker.setName(sc.nextLine());

        System.out.print("Level: ");
        workerLevel = sc.nextLine();
        if (Objects.equals(workerLevel, "JUNIOR") || Objects.equals(workerLevel, "Junior") || Objects.equals(workerLevel, "junior")){
            worker.setLevel(WorkerLevel.JUNIOR);
        } else if (Objects.equals(workerLevel, "MID_LEVEL") || Objects.equals(workerLevel, "mid level") || Objects.equals(workerLevel, "mid_level")) {
            worker.setLevel(WorkerLevel.MID_LEVEL);
        } else if (Objects.equals(workerLevel, "SENIOR") || Objects.equals(workerLevel, "Senior") || Objects.equals(workerLevel, "senior")) {
            worker.setLevel(WorkerLevel.SENIOR);
        }

        System.out.print("Base salary: ");
        worker.setBaseSalary(sc.nextDouble());

        System.out.print("How many contracts to this worker? ");
        numberWorkerContracts = sc.nextInt();

        for (int i = 1 ; i <= numberWorkerContracts ; i++){
            HourContract contract = new HourContract();
            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            String dateString = sc.nextLine();
            String[] date = dateString.split("/");
            int day = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int year = Integer.parseInt(date[2]);
            LocalDate localDate = LocalDate.of(year, month, day);
            contract.setDate(localDate);
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            contract.setValuePerHour(valuePerHour);
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();
            contract.setHours(duration);
            worker.addContract(contract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        sc.nextLine();
        String dateString = sc.nextLine();
        String[] date = dateString.split("/");
        int month = Integer.parseInt(date[0]);
        int year = Integer.parseInt(date[1]);

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.printf("Income for " + dateString + ": %.2f", worker.income(year, month));

        sc.close();
    }
}