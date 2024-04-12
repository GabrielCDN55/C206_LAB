public class Main {
    public static void main(String[] args) {
        BracoArticulado bracoArticulado1 = new BracoArticulado(100, "Braço1", 110, 5);
        Camera camera1 = new Camera(2);
        bracoArticulado1.setCamera(camera1);

        BracoArticulado bracoArticulado2 = new BracoArticulado(10,"Braço2",30,4);

        bracoArticulado2.trabalhar();
        bracoArticulado1.trabalhar();

        bracoArticulado1.mostraInfo();

        Empilhador empilhador1 = new Empilhador(30,"Empilhador1", 100, 1000);
        empilhador1.adicionaPacote(200);
        empilhador1.adicionaPacote(500);
        empilhador1.adicionaPacote(400);
        empilhador1.mostraPacotes();

        bracoArticulado1.recarregar(3);
        bracoArticulado1.recarregar(1);
    }
}