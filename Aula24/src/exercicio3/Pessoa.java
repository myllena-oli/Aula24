package exercicio3;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso, altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void envelhecer() {
        idade = idade + 1;
        if (idade <= 21) {
            crescer(0.05);
        }
    }

    public void engordar(double valor) {
        peso = peso + valor;
    }

    public void emagrecer(double valor) {
        peso = peso - valor;
    }

    public void crescer(double valor) {
        altura = altura + valor;

    }


}
