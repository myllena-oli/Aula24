package exercicio1;

import java.util.Scanner;

public class Caixa {
    private double saldo;
    private Scanner ler;

    public Caixa() {   //construtor
        this.saldo = 1000;
        this.ler = new Scanner(System.in);
    }

    public Scanner getLer() {
        return ler;
    }

    public double getSaldo() {
        return saldo;
    }

    public void credito(double valor) {
        saldo = saldo + valor;
    }

    public void debido(double valor) {
        saldo = saldo - valor;
    }

}
