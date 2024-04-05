public class Zumbi extends Monstro{
    private int numeroDeCerebrosComidos;
    public int getNumeroDeCerebrosComidos() {
        return numeroDeCerebrosComidos;
    }
    public void setNumeroDeCerebrosComidos(int numeroDeCerebrosComidos) {
        this.numeroDeCerebrosComidos = numeroDeCerebrosComidos;
    }
    public void atacarComMordida(Monstro monstro_alvo)
    {
        System.out.println("Zumbi atacando alvo com mordida. Vida do alvo reduzida em 20 pontos!");
        monstro_alvo.setVida(monstro_alvo.getVida() - 20);
        super.setVida(super.getEnergia() - 10);
    }
    public Zumbi(int idade, int vida, int energia, int numeroDeCerebrosComidos) {
        super(idade, vida, energia);
        this.numeroDeCerebrosComidos = numeroDeCerebrosComidos;
    }
}
