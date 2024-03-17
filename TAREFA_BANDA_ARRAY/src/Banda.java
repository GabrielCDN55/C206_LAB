public class Banda {
    private Musica[] musicas = new Musica[10];
    private String nome;
    private int numeroDeIntegrantes;

    public void tocarMusica(int posicao)
    {
        if(musicas[posicao] != null)
        {
            System.out.println("Tocando musica: " + musicas[posicao].getNome());
        }
        else
        {
            System.out.println("Não existe musica nessa posição! Verifique novamente");
        }
    }
    public void tocarShow()
    {
        System.out.println("Tocando show completo!");
        for (int i = 0; i < musicas.length; i++) {
            if(musicas[i] != null)
            {
                System.out.println("Tocando musica: " + musicas[i].getNome());
            }
        }
    }
    public boolean adicionarMusica(Musica musica)
    {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null)
            {
                musicas[i] = musica;
                System.out.println("Musica adicionada!");
                return true;
            }
        }
        return false;
    }
    public boolean deletarMusica(String nome)
    {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i].getNome() != "nome")
            {
                musicas[i] = null;
                System.out.println("Musica removida!");
                return true;
            }
            else
            {
                System.out.println("Não existe musica com esse nome!");
            }
        }
        return false;
    }
    public Banda(String nome, int numeroDeIntegrantes)
    {
        this.nome = nome;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }
}
