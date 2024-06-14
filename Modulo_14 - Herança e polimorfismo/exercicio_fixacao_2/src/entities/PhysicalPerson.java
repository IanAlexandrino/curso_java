package entities;

public final class PhysicalPerson extends Person{

    private Double healthExpenditures;

    public PhysicalPerson() {
        super();
    }

    public PhysicalPerson(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax(){
        if (annualIncome >= 20000){
            if (healthExpenditures > 0){
                return ((25.0 / 100.0) * annualIncome) - ((50.0 / 100.0) * healthExpenditures);
            } else {
                return ((25.0 / 100.0) * annualIncome);
            }
        } else {
            if (healthExpenditures > 0){
                return ((15.0 / 100.0) * annualIncome) - ((50.0 / 100.0) * healthExpenditures);
            } else {
                return ((15.0 / 100.0) * annualIncome);
            }
        }
    }
}
