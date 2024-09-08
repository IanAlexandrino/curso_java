package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String pathSource = "c:\\Users\\Ian Rodrigues\\Documents\\PROJETOS\\Curso JAVA COMPLETO\\Modulo_17 - Trabalhando com arquivos\\exercicio_proposto\\data.csv";
        String pathOut = "c:\\Users\\Ian Rodrigues\\Documents\\PROJETOS\\Curso JAVA COMPLETO\\Modulo_17 - Trabalhando com arquivos\\exercicio_proposto\\output";
        File path = new File(pathOut);
        ArrayList<Product> products = new ArrayList<>();
        boolean folderCreationCondition = true;

        if (!path.canExecute()){
            folderCreationCondition = new File(pathOut).mkdir();
        }

        if (folderCreationCondition){

            try (BufferedReader br = new BufferedReader(new FileReader(pathSource))){

                String line = br.readLine();

                while (line != null){

                    String[] productFeatures = line.split(",");
                    Product product = new Product(productFeatures[0], Double.parseDouble(productFeatures[1]), Integer.parseInt(productFeatures[2]));
                    products.add(product);
                    line = br.readLine();

                }

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\summary.csv"))){

                for (Product product : products){

                    bw.write(product.getName() + ",");
                    bw.write(String.format("%.2f", product.getTotalValue()));
                    bw.newLine();

                }

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } else {
            System.out.println("Não foi possível criar a pasta de destino!");
        }

    }
}