package exercicio5;

public class Carro {
    private int quantidadeDePortas;
    private String modelo, marca;
    private double potencia;

    public Carro(int quantidadeDePortas, String modelo, String marca){
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
    }
    public Carro(int quantidadeDePortas, String modelo, String marca, Double potencia){
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }
    public void ligarCarro() {
        System.out.println("Carro ligado.");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }
}
