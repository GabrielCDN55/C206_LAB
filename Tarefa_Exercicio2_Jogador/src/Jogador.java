public class Jogador {
    public Arma arma;
    public int energia;
    public int vida;

    public void atacar (Jogador alvo)
    {
        if(energia>=arma.custoDeEnergia)
        {
            this.energia -= this.arma.custoDeEnergia;
            alvo.vida -= this.arma.dano;
        }
        else
        {
            System.out.println("Energia Insuficiente!");
        }
    }

    public Jogador(Arma arma, int energia, int vida){
        this.energia = energia;
        this.vida = vida;
        this.arma = new Arma(arma.dano, arma.custoDeEnergia);
    }

    public String toString()
    {
        return "Vida:" + this.vida + " Energia:" + this.energia + " Dano da arma:" + this.arma.dano + " - " + "Arma custo de energia:" + this.arma.custoDeEnergia;
    }

}
