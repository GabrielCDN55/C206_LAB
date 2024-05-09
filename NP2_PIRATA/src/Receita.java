public class Receita {
    private String nome;
    private int dificuldade;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getDificuldade() {
        return dificuldade;
    }
    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
    public Receita(String nome, int dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }
}
