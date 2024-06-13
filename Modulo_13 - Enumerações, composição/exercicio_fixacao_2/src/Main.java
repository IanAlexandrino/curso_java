import entities.Client;
import entities.Product;
import entities.order.Order;
import entities.order.OrderItem;
import entities.order.OrderStatus;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Client client = new Client();
        Order order = null;

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        client.setName(sc.nextLine());

        System.out.print("Email: ");
        client.setEmail(sc.nextLine());

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDateString = sc.nextLine();
        String[] splitBirthDate = birthDateString.split("/");
        LocalDate birthDate = LocalDate.of(Integer.parseInt(splitBirthDate[2]), Integer.parseInt(splitBirthDate[1]), Integer.parseInt(splitBirthDate[0]));
        client.setBirthDate(birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        if (Objects.equals(status, "PENDING_PAYMENT") || Objects.equals(status, "pending_payment")){
            order = new Order(OrderStatus.PENDING_PAYMENT, client);
        } else if (Objects.equals(status, "PROCESSING") || Objects.equals(status, "processing") || Objects.equals(status, "Processing")) {
            order = new Order(OrderStatus.PROCESSING, client);
        } else if (Objects.equals(status, "SHIPPED") || Objects.equals(status, "Shipped") || Objects.equals(status, "shipped")) {
            order = new Order(OrderStatus.SHIPPED, client);
        } else if (Objects.equals(status, "DELIVERED") || Objects.equals(status, "Delivered") || Objects.equals(status, "delivered")) {
            order = new Order(OrderStatus.DELIVERED, client);
        }

        System.out.print("How many items to this order? ");
        int quantityOrderItems = sc.nextInt();

        for (int i = 1 ; i <= quantityOrderItems ; i++){
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            Product product = new Product(name, price);
            OrderItem orderItem = new OrderItem(quantity, product.getPrice(), product);
            assert order != null;
            order.addItem(orderItem);
        }

        System.out.println(order);

        sc.close();
    }
}