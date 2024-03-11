package problema_dados_pessoas.entidades;

public class Pessoa {

    private double altura;
    private String genero;

    public Pessoa() {
    }

    public Pessoa(double altura, String genero) {
        this.altura = altura;
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
