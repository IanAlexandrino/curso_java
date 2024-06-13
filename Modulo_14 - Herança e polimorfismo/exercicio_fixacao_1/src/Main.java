import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberProducts = sc.nextInt();

        for (int i = 1 ; i <= numberProducts ; i++){
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            sc.nextLine();
            String choice = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (Objects.equals(choice, "i") || Objects.equals(choice, "I")){

                System.out.print("Custom fee: ");
                double customFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customFee);
                products.add(product);

            } else if (Objects.equals(choice, "u") || Objects.equals(choice, "U")) {

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                String manufactureDateString = sc.nextLine();
                String[] manufactureDateSplit = manufactureDateString.split("/");
                LocalDate manufactureDate = LocalDate.of(
                        Integer.parseInt(manufactureDateSplit[2]),
                        Integer.parseInt(manufactureDateSplit[1]),
                        Integer.parseInt(manufactureDateSplit[0]));
                Product product = new UsedProduct(name, price, manufactureDate);
                products.add(product);

            } else {

                Product product = new Product(name, price);
                products.add(product);

            }
        }

        System.out.println("\nPRICE TAGS: ");

        for (Product product : products){
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}