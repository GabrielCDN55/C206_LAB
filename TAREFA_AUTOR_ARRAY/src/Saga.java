public class Saga {
    private int nota;
    private Livro[] livros = new Livro[10];

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public Saga(int nota) {
        this.nota = nota;
    }

    public void listarLivros()
    {
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] != null)
            {
                System.out.println("Titulo do livro: " + livros[i].getTitulo());
                System.out.println("Numero de páginas do livro: " + livros[i].getPaginas());
            }
        }
    }
    public void adicionarLivros(Livro livro)
    {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null)
            {
                livros[i] = livro;
                break;
            }
        }
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
}
