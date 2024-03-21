public class Main {
    public static void main(String[] args) {

        Notebook notebook1 = new Notebook();

        notebook1.setNome("Notebook1");
        notebook1.setValor(1000);
        notebook1.setMemoria("Memoria1");
        notebook1.setProcessador("Processador1");

        // Produto console1 = new Console(); Poliformismo
        // ((Console)console1).setGeracao("1 geração"); Poliformismo
        
        Console console1 = new Console();
        console1.setNome("Console1");
        console1.setValor(2000);
        console1.setGeracao("1 geração");
        console1.setMarca("Sony");

        console1.mostraInfo();
        notebook1.mostraInfo();
    }
}