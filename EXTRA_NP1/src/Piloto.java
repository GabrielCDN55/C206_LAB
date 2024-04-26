public class Piloto {
    private String nome;
    private int idade;
    private String nacionalidade;
    private static int idGeral = 0;
    private int id;
    public String getNome() {
        return nome;
    }
    public void correr(Carro carro)
    {
        System.out.println("Piloto " + nome + " correndo com o carro!");
        System.out.println("Seguem as informações do carro:");
        carro.mostraInfo();
    }
    public Piloto(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        idGeral += 1;
        this.id = idGeral;
    }
    public void mostraInfo()
    {
        System.out.println("Nome: " + nome + " Idade: " + idade + " Nacionalidade: " + nacionalidade + " ID do piloto: " + id);
    }

}
