public class Main {
    public static void main(String[] args) {
        Vampiro vampiro1 = new Vampiro(1000,100,100,50,false);

        vampiro1.recuperarVida();
        vampiro1.transformar();

        Zumbi zumbi1 = new Zumbi(50,100,100,10);

        vampiro1.atacarComMordida(zumbi1);
        vampiro1.mostraInfo();

        zumbi1.mostraInfo();

        Bruxa bruxa1 = new Bruxa(150,100,100);

        bruxa1.aprenderFeitico("Kamehameha", 100);
        bruxa1.lancarFeitico(vampiro1, 0);
        bruxa1.mostraInfo();
        bruxa1.assustar(vampiro1);

        vampiro1.mostraInfo();
    }
}