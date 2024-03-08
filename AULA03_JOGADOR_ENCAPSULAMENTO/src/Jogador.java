public class Jogador {
    private Arma arma;
    private int energia;
    private int vida;

    public void atacar(Jogador alvo)
    {
        if(this.energia >= this.arma.getCustoDeEnergia())
        {
            this.energia -= this.arma.getCustoDeEnergia();
            alvo.vida -= this.arma.getDano();
        }
        else
        {
            System.out.println("Jogador não possui energia suficiente para o ataque!");
        }
    }
    public Jogador()
    {

    }
    public Jogador(Arma arma, int energia, int vida)
    {
        this.energia = energia;
        this.vida = vida;
        this.arma = new Arma(arma.getDano(), arma.getCustoDeEnergia());

    }
    public String toString()
    {
        return "Vida:" + this.vida + " Energia:" + this.energia + " Dano da arma:" + this.arma.getDano() + " - " + "Arma custo de energia:" + this.arma.getCustoDeEnergia();
    }
}
