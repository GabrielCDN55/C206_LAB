public class Main {
    public static void main(String[] args) {
        Capitao capitao1 = new Capitao("Gancho", "Pão com manteiga", 10, 0);
        Espadachim espadachim1 = new Espadachim("Zoro", "Pizza", 11, "Corta muito");
        Espadachim espadachim2 = new Espadachim("Zore", "Lasanha", 4, "Corta pouco");
        Espadachim espadachim3 = new Espadachim("Zora", "Bolo de fubá", 8, "Corta mais ou menos");
        Espadachim espadachim4 = new Espadachim("Zoru", "Pão com manteiga", 2, "Corta nada");
        Cozinheiro cozinheiro = new Cozinheiro("Sanji", "Pizza", 5);

        capitao1.conquistarNovoSeguidor(espadachim1);
        capitao1.conquistarNovoSeguidor(espadachim2);
        capitao1.conquistarNovoSeguidor(espadachim3);
        capitao1.conquistarNovoSeguidor(espadachim4);
        capitao1.conquistarNovoSeguidor(cozinheiro);

        capitao1.mostraInfo();
        capitao1.darOrdens();
        capitao1.mudarRota();

        espadachim1.mostraInfo();
        espadachim1.darOrdens();
        espadachim1.mudarRota();

        capitao1.comer(cozinheiro, 0);
        espadachim1.comer(cozinheiro, 2);
        espadachim3.comer(cozinheiro,0);
        capitao1.lutar(espadachim1);

        cozinheiro.mostraReceitas();
        cozinheiro.mostraInfo();
    }
}