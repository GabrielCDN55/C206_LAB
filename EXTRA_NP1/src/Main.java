public class Main {
    public static void main(String[] args) {
        Equipe equipe1 = new Equipe("Ferrari");
        Piloto piloto1 = new Piloto("Felipe Massa", 40, "Brasileiro");
        Piloto piloto2 = new Piloto("Alonso", 42, "Espanhol");
        Piloto piloto3 = new Piloto("Hamilton", 32, "Inglês");
        Piloto piloto4 = new Piloto("Senna", 50, "Brasileiro");

        equipe1.adicionarPiloto(piloto1);
        equipe1.adicionarPiloto(piloto2);
        equipe1.adicionarPiloto(piloto3);
        equipe1.adicionarPiloto(piloto4);
        equipe1.pitStop(2, 2);
        equipe1.mostraInfo();

        equipe1.retirarPiloto(1);
        equipe1.mostraInfo();

        piloto1.correr(equipe1.getCarro());
        equipe1.getCarro().correr();
    }
}