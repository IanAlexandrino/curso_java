package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        float nmrQualquer = entrada.nextFloat();
        
        if (nmrQualquer >= 0 && nmrQualquer <= 25){

            System.out.println("Intervalo [0,25]" );
            
        } else if (nmrQualquer > 25 && nmrQualquer <= 50) {

            System.out.println("Intervalo (25,50]" );

        } else if (nmrQualquer > 50 && nmrQualquer <= 75) {

            System.out.println("Intervalo (50,75]" );

        } else if (nmrQualquer > 75 && nmrQualquer <= 100) {

            System.out.println("Intervalo (75,100]" );

        } else {

            System.out.println("Fora de intervalo");

        }

        entrada.close();

    }
    
}
