public class Carro {
    private Motor motor;
    private int tipoDePneu;
    public void setTipoDePneu(int tipoDePneu) {
        this.tipoDePneu = tipoDePneu;
    }
    public void correr()
    {
        System.out.println("Carro está correndo!");
    }
    public Carro(int tipoDePneu, int potencia, boolean turbo) {
        this.tipoDePneu = tipoDePneu;
        Motor motor = new Motor(potencia, turbo);
        this.motor = motor;
    }
    public void mostraInfo()
    {
        System.out.println("Seguem informações do motor do carro:");
        motor.mostraInfo();
        System.out.println("Tipo de Pneu do carro: " + tipoDePneu);
    }
}
