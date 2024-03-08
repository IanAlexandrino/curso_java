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

    public double deposito(double valorDeposito){
        return this.saldoConta += valorDeposito;
    }

    public double saque(double valorSaque){
        return this.saldoConta -= (valorSaque + 5.00);
    }

    public String toString(){
        return "Account data: \n" +
                "Account " + numeroConta + ", " +
                "Holder: " + nomeTitular + ", " +
                "Balance: $ " + saldoConta;
    }
}
