public class Aluno extends Usuario{
    private int notas[];
    public Aluno(int id, int senha) {
        super(id, senha);
        notas = new int[10];
    }
    @Override
    public void logar() {
        System.out.println("Aluno logando no sistema com sua carteirinha!");
    }
    public void addNotas(int nota)
    {
        System.out.println("Adicionando nota ao histórico do aluno");
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] == 0)
            {
                notas[i] = nota;
                break;
            }
        }
        System.out.println("Segue lista de notas do aluno");
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] != 0)
            {
                System.out.println(notas[i]);
            }

        }
    }
}
