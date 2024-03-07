package exercicio2.entidades;

public class Employee {

    private String name;
    private double grossSalary;
    private double tax;

    public Employee() {
    }

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String netSalary(){
        return "Employee: " + name + ", $ " + (grossSalary - tax);
    }

    public void increaseSalary(double percentage){

        double newIncrease = (percentage * grossSalary) / 100;

        System.out.println("Update data: " + name + ", $ " + (grossSalary - tax) + newIncrease);
    }
}
