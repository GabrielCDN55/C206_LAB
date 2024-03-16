public class Banda {
    private String nome;
    private String genero;
    public Empresario[] empresarios = new Empresario[1];
    public Musica[] musicas = new Musica[10];
    public Membro[] membros = new Membro[10];
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void mostraInfo()
    {
        System.out.println("Empresário da banda: " + empresarios[0]);
        System.out.println("Lista de membros da banda: ");
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] != null)
            {
                System.out.println("Nome do membro: " + membros[i].getNome());
                System.out.println("Função do membro: " + membros[i].getFuncao());
            }
        }
        System.out.println("Lista de musicas da banda: ");
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] != null)
            {
                System.out.println("Nome musica: " + musicas[i].getNome());
                System.out.println("Duração musica: " + musicas[i].getDuracao());
            }
        }
    }
    public void addMusicaNova(Musica musica){
        for (int i = 0; i < musicas.length; i++) {
            if(musicas[i] == null)
            {
                musicas[i] = musica;
                break;
            }
        }
    }
    public void addMembroNovo(Membro membro)
    {
        for (int i = 0; i < membros.length; i++) {
            if(membros[i] == null)
            {
                membros[i] = membro;
                break;
            }
        }
    }
    public Banda(String nome, String genero)
    {
        this.nome = nome;
        this.genero = genero;
    }

}
