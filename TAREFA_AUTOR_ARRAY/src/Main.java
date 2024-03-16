public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Gabriel");

        autor1.adicionarSagas(new Saga(10));
        autor1.adicionarSagas(new Saga(10));

        autor1.listarSagas();
    }
}