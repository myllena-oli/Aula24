package exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10);
        Scanner ler = new Scanner(System.in);

        System.out.println("Quadrado de lado: " + quadrado.retornarValorLado());
        System.out.println("A área do Quadrado é " + quadrado.calcularArea());

        System.out.println("Digite o valor do novo lado do quadrado: ");
        quadrado.trocarLado(ler.nextDouble());

        System.out.println("O novo quadrado tem lado: " + quadrado.retornarValorLado());
        System.out.println("A área do Quadrado é " + quadrado.calcularArea());
    }
}
