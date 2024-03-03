public class Rato {

    public float velocidade;

    public boolean escondido;

    public void esconder()
    {
        this.escondido = true;
        System.out.println("Rato se escondeu!");
    }

    public void procurarComida()
    {
        this.escondido = false;
        System.out.println("Rato não está escondido!");
    }

    public String toString()
    {
        return "Velocidade do rato: " + this.velocidade + " Rato está escondido? " + this.escondido;
    }

}
