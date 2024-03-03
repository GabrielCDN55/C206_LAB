import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gato gato = new Gato();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a cor do gato:");
        gato.cor = entrada.nextLine();

        System.out.println("Informe a idade do gato:");
        gato.idade = entrada.nextInt();

        System.out.println("Informe a velocidade do gato:");
        gato.velocidade = entrada.nextInt();

        Rato rato = new Rato();

        System.out.println("Informe a velocidade do rato:");
        rato.velocidade = entrada.nextFloat();

        rato.esconder();

        gato.caçar(rato);

        rato.procurarComida();

        gato.caçar(rato);

        rato.esconder();

        System.out.println("Gato: " + gato.toString());
        System.out.println("Rato: " + rato.toString());

    }
}