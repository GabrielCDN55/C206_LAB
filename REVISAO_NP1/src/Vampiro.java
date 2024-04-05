public class  Vampiro extends Monstro {
    private int medidorDeSangue;
    private boolean formaDeMorcego;
    public int getMedidorDeSangue() {
        return medidorDeSangue;
    }
    public void setMedidorDeSangue(int medidorDeSangue) {
        this.medidorDeSangue = medidorDeSangue;
    }
    public boolean isFormaDeMorcego() {
        return formaDeMorcego;
    }
    public void setFormaDeMorcego(boolean formaDeMorcego) {
        this.formaDeMorcego = formaDeMorcego;
    }

    //construtor para vampiro unindo com o do monstro
    public Vampiro(int idade, int vida, int energia,int medidorDeSangue, boolean formaDeMorcego) {
        super(idade, vida, energia);
        this.medidorDeSangue = medidorDeSangue;
        this.formaDeMorcego = formaDeMorcego;
    }

    public void transformar()
    {
        if(formaDeMorcego == true)
        {
            formaDeMorcego = false;
        }
        else
        {
            formaDeMorcego = true;
        }
    }
    public void recuperarVida()
    {
        this.medidorDeSangue -= 10;
        System.out.println("Vampiro recuperou 10 pontos de vida");
        super.setVida(super.getVida() + 10);
    }
    public void atacarComMordida(Monstro monstro_alvo)
    {
        System.out.println("Vampiro atacando alvo com mordida. Vida do alvo reduzida em 15 pontos!");
        monstro_alvo.setVida(monstro_alvo.getVida() - 15);
        super.setEnergia(super.getEnergia() - 10);
    }
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Medidor de sangue em: " + medidorDeSangue + " Vampiro está na forma de morcego? " + formaDeMorcego);
    }
}
