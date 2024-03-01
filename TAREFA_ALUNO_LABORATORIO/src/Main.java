import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do aluno:");
        aluno.nome = entrada.nextLine();
        System.out.println("Informe a matricula:");
        aluno.matricula = entrada.nextInt();
        System.out.println("Informe o período:");
        aluno.periodo = entrada.nextInt();
        System.out.println("Informe a nota da NP1:");
        aluno.np1 = entrada.nextInt();
        System.out.println("Informe a nota da NP2:");
        aluno.np2 = entrada.nextInt();

        int media1 = aluno.calculaMedia();

        if(media1 >= 60)
        {
            System.out.println("Aluno aprovado");
        }
        else if (media1 < 60)
        {
            System.out.println("Será necessário NP3. Informe o resultado para novo cálculo:");
            int media2 = aluno.calculaNP3(media1);
            if (media2 >= 50)
            {
                System.out.println("Aluno aprovado!");
            }
            else
            {
                System.out.println("Aluno reprovado!");
            }
        }

        System.out.println(aluno.toString());

    }
}