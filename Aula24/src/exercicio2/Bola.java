package exercicio2;

public class Bola {
    private double circunferencia;
    private String cor, marca, material;
    private double velocidade;

    public Bola(double circunferencia, String cor, String marca, String material, double velocidade) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.velocidade = velocidade;
    }

    public void trocaCor(String corNova) {
        cor = corNova;
    }

    public String MostraCor() {
        return cor;
    }

}
