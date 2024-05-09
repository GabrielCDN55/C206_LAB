public class Capitao extends Pirata implements Comandar{
    private int numeroDeSeguidores;
    public int getNumeroDeSeguidores() {
        return numeroDeSeguidores;
    }
    public void setNumeroDeSeguidores(int numeroDeSeguidores) {
        this.numeroDeSeguidores = numeroDeSeguidores;
    }
    public Capitao(String nome, String comidaFavorita, int poder, int numeroDeSeguidores) {
        super(nome, comidaFavorita, poder);
        this.numeroDeSeguidores = numeroDeSeguidores;
    }
    @Override
    public void darOrdens() {
        System.out.println("O capitão está ordenando " + numeroDeSeguidores + " Tripulantes!");
    }
    @Override
    public void mudarRota() {
        System.out.println("O capitão está mudando a rota!");
    }
    public void conquistarNovoSeguidor(Pirata pirata)
    {
        if((pirata.getPoder() + 5) >= getPoder())
        {
            System.out.println("Novo seguidor contratado!");
            numeroDeSeguidores += 1;
        }
        else
        {
            System.out.println("Seguidor é muito fraco. Dispensado!");
        }
    }
    @Override
    public void mostraInfo()
    {
       super.mostraInfo();
       System.out.println("Numero de seguidores: " + numeroDeSeguidores);
    }
}
