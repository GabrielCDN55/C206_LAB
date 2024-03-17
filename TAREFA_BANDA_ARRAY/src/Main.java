public class Main {
    public static void main(String[] args) {
        Banda banda1 = new Banda("BandaTop", 15);
        Musica musica1 = new Musica();
        musica1.setNome("musica1");
        musica1.setAlbum("album1");

        Musica musica2 = new Musica();
        musica2.setNome("musica2");
        musica2.setAlbum("album2");

        Musica musica3 = new Musica();
        musica3.setNome("musica3");
        musica3.setAlbum("album3");

        banda1.adicionarMusica(musica1);
        banda1.adicionarMusica(musica2);
        banda1.adicionarMusica(musica3);

        banda1.tocarShow();

        banda1.deletarMusica("musica2");

        banda1.tocarShow();
    }
}