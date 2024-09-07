package entities;

public class Product {

    private String name;
    private double value;
    private int quantity;
    private double totalValue;

    public Product() {
    }

    public Product(String name, double value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
        this.totalValue = value * quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
