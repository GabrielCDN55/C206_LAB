public class BracoArticulado extends Robo{
    private int numeroDeArticulacoes;
    private Garra garra;
    private Camera camera;
    public int getNumeroDeArticulacoes() {
        return numeroDeArticulacoes;
    }
    public void setNumeroDeArticulacoes(int numeroDeArticulacoes) {
        this.numeroDeArticulacoes = numeroDeArticulacoes;
    }
    public Garra getGarra() {
        return garra;
    }
    public void setGarra(Garra garra) {
        this.garra = garra;
    }
    public Camera getCamera() {
        return camera;
    }
    public void setCamera(Camera camera) {
        this.camera = camera;
    }
    public BracoArticulado(int energia, String nome, int energiaMaxima, int numeroDeArticulacoes) {
        super(energia, nome, energiaMaxima);
        this.numeroDeArticulacoes = numeroDeArticulacoes;
        garra = new Garra();
        garra.setPressao(8);
        this.camera = camera;
        setTotalDeRobos((getTotalDeRobos()) + 1);
    }
    @Override
    public void trabalhar() {
        if (getEnergia() >= 10)
        {
            if (camera == null) {
                System.out.println("Braço está sem camera! Necessário verificar");
            } else {
                int posicaoPeca = camera.acharPecas();
                if (posicaoPeca % 2 == 0) //condição para variar entre as funções - ter ou não posição
                {
                    garra.agarrarPeca(posicaoPeca);
                } else if (posicaoPeca % 2 == 1) //condição para variar entre as funções - ter ou não posição
                {
                    garra.agarrarPeca();
                }
            }
            setEnergia(getEnergia() - 10);
        }
        else
        {
            System.out.println("Robo não possui energia suficiente para trabalhar! Necessário recarregar");
        }
    }
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Numero de articulações do  Braço: " + numeroDeArticulacoes);
        garra.mostraInfoGarra();
        camera.mostraInfoCamera();
    }
}
