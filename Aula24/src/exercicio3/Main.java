package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa("Myllena", 17, 1.63);
        int ano = 2017;

        System.out.println("O ano é "+ano+"\nA "+ pessoa1.getNome()+" tem "+pessoa1.getIdade()+" anos e "+pessoa1.getAltura()+" de altura.");
        System.out.println("Deseja informar o peso da "+pessoa1.getNome()+"? Digite s ou n:");
        char selecao = ler.next().charAt(0);
        System.out.println(selecao);
        if (selecao=='s'){
            System.out.println("Digite o peso: ");
            pessoa1.setPeso(ler.nextDouble());
        }

        System.out.println("Quantos anos vocês quer avançar no futuro? ");
        int tempo = ler.nextInt();

        for (int i=0;i<tempo;i++){
            pessoa1.envelhecer();
        }
        System.out.println("Nesse período a "+pessoa1.getNome()+" engordou quantos quilos? ");
        pessoa1.engordar(ler.nextDouble());
        System.out.println("Nesse período a "+pessoa1.getNome()+" emagreceu quantos quilos? ");
        pessoa1.emagrecer(ler.nextDouble());
        if(selecao=='s'){
            System.out.println("Atualizando:\nO ano é "+(ano+tempo)+"\nA "+ pessoa1.getNome()+" tem "+pessoa1.getIdade()
                    +" anos, pesa "+pessoa1.getPeso()+" quilos e tem "+pessoa1.getAltura()+" de altura.");

        }else{
            System.out.println("Atualizando:\nO ano é "+(ano+tempo)+"\nA "+ pessoa1.getNome()+" tem "+pessoa1.getIdade()+" anos e "+pessoa1.getAltura()+" de altura.");
        }

    }
}
