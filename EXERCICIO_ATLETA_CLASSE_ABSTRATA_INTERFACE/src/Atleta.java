public abstract class Atleta {
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public Atleta(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    private String nome;
    private int idade;
    public abstract void treinar();

}
