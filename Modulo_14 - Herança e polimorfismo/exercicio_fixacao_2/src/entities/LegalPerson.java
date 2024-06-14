package entities;

public final class LegalPerson extends Person{

    private Integer numberOfEmployees;

    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax(){
        if (numberOfEmployees > 10){
            return ((14.0 / 100.0) * annualIncome);
        } else {
            return ((16.0 / 100.0) * annualIncome);
        }
    }
}
