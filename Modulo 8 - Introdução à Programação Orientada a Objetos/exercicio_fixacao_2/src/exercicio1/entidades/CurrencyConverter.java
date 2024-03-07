package exercicio1.entidades;

public class CurrencyConverter {

    private static final int iof = 6;

    public static double converterDollar(double valorDolar, double dolarComprado){

        double dolarConvertido = dolarComprado * valorDolar;
        double valorIof = dolarConvertido * iof / 100;

        return dolarConvertido + valorIof;
    }

}
