package exercicio1;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Caixa caixa1 = new Caixa();

        System.out.println("Quantos lançamentos deseja? ");
        int quantidade = caixa1.getLer().nextInt();
        caixa1.getLer().nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("O " + (i + 1) + "º lançamento é crédito ou débito? ");
            String tipo = caixa1.getLer().nextLine();
            if (Objects.equals(tipo, "crédito")) {
                System.out.println("Qual valor você quer creditar? ");
                caixa1.credito(caixa1.getLer().nextDouble());
                caixa1.getLer().nextLine();

            } else if (Objects.equals(tipo, "débito")) {
                System.out.println("Qual valor você quer debitar? ");
                caixa1.debido(caixa1.getLer().nextDouble());
                caixa1.getLer().nextLine();

            } else {
                System.out.println("Você digitou incorretamente. Confira a Digitação.");
                i--;
            }
        }
        System.out.printf("Seu saldo final é R$%.2f", caixa1.getSaldo());


    }
}