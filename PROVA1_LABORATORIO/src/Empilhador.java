public class Empilhador extends Robo{
    private Pacote pacotes[];
    private int pesoMaximo;
    private int pesoAtual = 0;
    public Empilhador(int energia, String nome, int energiaMaxima, int pesoMaximo) {
        super(energia, nome, energiaMaxima);
        this.pacotes = new Pacote[15];
        this.pesoMaximo = pesoMaximo;
        setTotalDeRobos((getTotalDeRobos()) + 1);
    }
    public void adicionaPacote(int peso)
    {
        Pacote pacote = new Pacote(peso);
        if ((pesoAtual + peso) <= pesoMaximo) {
            for (int i = 0; i < pacotes.length; i++) {
                if (pacotes[i] == null) {
                    pacotes[i] = pacote;
                    pesoAtual += peso;
                    break;
                }
            }
        }
        else
        {
            System.out.println("Não é possível adicionar esse pacote de " + peso + ". Peso máximo de " + pesoMaximo +" atingido");
            System.out.println("Peso atual suportado: " + pesoAtual);
        }
    }
    public void removePacote(int posicao)
    {
        if(pacotes[posicao] != null)
        {
            pacotes[posicao] = null;
            System.out.println("Pacote removido!");
        }
        else
        {
            System.out.println("Não foi encontrado pacote nessa posição");
        }
    }
    public void mostraPacotes()
    {
        for (int i = 0; i < pacotes.length; i++)
        {
            if (pacotes[i] != null)
            {
                System.out.println("Peso pacote " + (i + 1) + ": " + pacotes[i].getPeso());
            }
        }

    }
}
