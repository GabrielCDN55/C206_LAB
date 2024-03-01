import java.util.Scanner;

public class Aluno {
    public int matricula;
    public int np1;
    public int np2;
    public int periodo;
    public String nome;

    public int calculaMedia()
    {
        return ((this.np1 + this.np2) / 2);
    }
    public int calculaNP3(int media)
    {
        Scanner entrada = new Scanner(System.in);
        int np3;
        np3 = entrada.nextInt();
        return ((media + np3) / 2);
    }

    public String toString()
    {
        return "Nome:" + this.nome + " Matricula:" + this.matricula + " NP1:" + this.np1 + " NP2:" + this.np2 + " Periodo:" + this.periodo;
    }
}
