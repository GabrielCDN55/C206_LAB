public class Motor {
    private int potencia;
    private boolean turbo;
    public Motor(int potencia, boolean turbo) {
        this.potencia = potencia;
        this.turbo = turbo;
    }
    public void mostraInfo()
    {
        System.out.println("Potencia do motor: " + potencia + " Motor é turbo? " + turbo);
    }
}
