package entidades;

public class Conta {

    private int numeroConta;
    private String nomeTitular;
    private double saldoConta;

    public Conta() {
    }

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public Conta(int numeroConta, String nomeTitular, double saldoConta) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldoConta = saldoConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public String deposito(double valorDeposito){

        this.saldoConta += valorDeposito;
        System.out.println("Update account data:");

        return this.toString();
    }

    public String saque(double valorSaque){

        this.saldoConta -= (valorSaque + 5.00);
        System.out.println("Update account data:");

        return this.toString();
    }

    public String toString(){
        return  "Account " + numeroConta + ", " +
                "Holder: " + nomeTitular + ", " +
                "Balance: $ " + String.format("%.2f", saldoConta);
    }
}
