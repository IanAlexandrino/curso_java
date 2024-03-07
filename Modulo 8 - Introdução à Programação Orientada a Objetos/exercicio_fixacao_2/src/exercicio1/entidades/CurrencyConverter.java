package exercicio1.entidades;

public class CurrencyConverter {

    private static final int iof = 6;

    public static double converterDollar(double valorDolar, double dolarComprado){

        double dolaConvertido = dolarComprado * valorDolar;
        double valorIof = dolaConvertido * iof / 100;

        return dolarComprado + valorIof;
    }

}
