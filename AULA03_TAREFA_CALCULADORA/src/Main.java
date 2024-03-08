import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Indique o valor do raio:");

        double raio = entrada.nextDouble();

        System.out.println("Indique o valor da altura para cálculo do cilindro:");
        double altura = entrada.nextDouble();

        System.out.println("circunferencia: " + Calculadora.circunferencia(raio));
        System.out.println("Volume da esfera: " + Calculadora.volumeEsfera(raio));
        System.out.println("Volume do cilindro " + Calculadora.volumeCilindro(raio, altura));


    }
}