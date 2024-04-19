public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, 1111);
        Professor professor1 = new Professor(2, 2222, 20);
        Estagiario estagiario1 = new Estagiario(3, 3333, 12);

        aluno1.logar();
        professor1.logar();
        estagiario1.logar();

        aluno1.addNotas(50);
        estagiario1.calculaSalario();
        professor1.calculaSalario();

    }
}