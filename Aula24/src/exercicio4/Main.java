package exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ContaCorrente contaMyllena = new ContaCorrente("23", "Myllena", 1000.00);
        ContaCorrente contaMaria = new ContaCorrente("123", "Maria");

        System.out.println("Primeira conta:\nNúmero: " + contaMyllena.getNumeroConta() + "\nCorrentista: " + contaMyllena.getNomeCorrentista() + "\nSaldo: " + contaMyllena.getSaldo());
        System.out.println("\nSegunda conta:\nNúmero: " + contaMaria.getNumeroConta() + "\nCorrentista: " + contaMaria.getNomeCorrentista() + "\nSaldo: " + contaMaria.getSaldo());
        System.out.println("Digite um valor para saque na primeira conta: ");
        contaMyllena.saqueConta(ler.nextDouble());
        System.out.println("Digite um valor para depósito na segunda conta: ");
        contaMaria.depositoConta(ler.nextDouble());

        System.out.println("\nAqui está as contas atualizadas: ");
        System.out.println("Primeira conta:\nNúmero: " + contaMyllena.getNumeroConta() + "\nCorrentista: " + contaMyllena.getNomeCorrentista() + "\nSaldo: " + contaMyllena.getSaldo());
        System.out.println("\nSegunda conta:\nNúmero: " + contaMaria.getNumeroConta() + "\nCorrentista: " + contaMaria.getNomeCorrentista() + "\nSaldo: " + contaMaria.getSaldo());

    }
}
