public class Autor {

    private String nome;
    private Saga[] sagas = new Saga[10];
    public Autor(String nome)
    {
        this.nome = nome;
    }
    public void listarSagas()
    {
        for (int i = 0; i < sagas.length; i++) {
            if(sagas[i] != null)
            {
                System.out.println("Nota da saga: " + sagas[i].getNota());
                sagas[i].listarLivros();
            }
        }
    }
    public void adicionarSagas(Saga saga)
    {
        for (int i = 0; i < sagas.length; i++) {
            if(sagas[i] == null)
            {
                sagas[i] = saga;
                sagas[i].adicionarLivros(new Livro("Livro1", 100));
                break;
            }
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
