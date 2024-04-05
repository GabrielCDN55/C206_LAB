public class Monstro {
    private int idade;
    private int vida;
    private int energia;

    public Monstro(int idade, int vida, int energia) {
        this.idade = idade;
        this.vida = vida;
        this.energia = energia;
    }
    public void mostraInfo() {
        System.out.println("Vida do monstro: " + vida + " Idade do monstro: " + idade + " Energia do monstro: " + energia);
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public void assustar(Monstro monstro_alvo)
    {
        System.out.println("Monstro foi assustado. Energia diminuiu em 10 unidades");
        monstro_alvo.energia -= 10;
    }
}
