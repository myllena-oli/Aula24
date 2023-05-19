package exercicio2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");
        Bola bolaFutebol = new Bola(68, "branca", "Nike", "couro", 129);
        Bola bolaVolei = new Bola(65, "amarela", "adidas", "poliuretano", 117);

        System.out.println("Cor da bola de futebol: " + bolaFutebol.MostraCor());
        System.out.println("Cor da bola de volei: " + bolaVolei.MostraCor());

        bolaFutebol.trocaCor("vermelha");
        bolaVolei.trocaCor("azul");

        System.out.println("Cor da bola de futebol pintada: " + bolaFutebol.MostraCor());
        System.out.println("Cor da bola de volei pintada: " + bolaVolei.MostraCor());

    }
}
