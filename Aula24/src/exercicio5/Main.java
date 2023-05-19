package exercicio5;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(4, "Corolla", "Toyota");
        Carro carro2 = new Carro(4, "Mobi", "Fiat", 1.0);
        System.out.println("Aqui estão os carros: ");

        System.out.println("Modelo: " + carro1.getModelo() + ", Marca: " + carro1.getMarca() + ", Potência: " + carro1.getPotencia());
        System.out.println("\nModelo: " + carro2.getModelo() + ", Marca: " + carro2.getMarca() + ", Potência: " + carro2.getPotencia());

        System.out.println("\nLigando os carros: ");
        carro1.ligarCarro();
        carro2.ligarCarro();
    }
}
