package exercicio6;

public class Quadrado {
    private double lado;
    public Quadrado(double lado) {
        this.lado = lado;
    }
    public void trocarLado (double novoValor) {
        this.lado = novoValor;
    }
    public double retornarValorLado() {
        return lado;
    }
    public double calcularArea() {
        return lado * lado;
    }

}
