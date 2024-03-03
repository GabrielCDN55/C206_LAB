import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador(new Arma(100,10),100, 1000);

        Jogador jogador2 = new Jogador(new Arma(200,20),100,1000);

        jogador1.atacar(jogador2);

        System.out.println("Jogador 1: " + jogador1.toString());
        System.out.println("Jogador 2: " + jogador2.toString());

        jogador2.atacar(jogador1);

        System.out.println("Jogador 1: " + jogador1.toString());
        System.out.println("Jogador 2: " + jogador2.toString());
    }
}