package entities.order;

import entities.Client;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;

    private final List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

    public Order(OrderStatus status, Client client) {
        this.moment = LocalDateTime.now();
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem(OrderItem orderItem){
        this.orderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem){
        this.orderItems.remove(orderItem);
    }

    public double total(){
        double total = 0;

        for (OrderItem orderItem : orderItems){
            total += orderItem.subTotal();
        }

        return total;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY: \n");
        sb.append("Order moment: ").append(moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ")
                .append(client.getName())
                .append(" (")
                .append(client.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .append(") - ")
                .append(client.getEmail())
                .append("\n");
        sb.append("Order items: \n");
        for (OrderItem orderItem : orderItems){
            sb.append(orderItem.getProduct().getName())
                    .append(", $")
                    .append(String.format("%.2f", orderItem.getPrice()))
                    .append(", Quantity: ")
                    .append(orderItem.getQuantity())
                    .append(", Subtotal: $")
                    .append(String.format("%.2f", orderItem.subTotal()))
                    .append("\n");
        }
        sb.append("Total price: $").append(String.format("%.2f", total()));
        return sb.toString();
    }
}
