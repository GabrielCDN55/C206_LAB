public class Main {
    public static void main(String[] args) {
        Banda banda1 = new Banda("Banda1","Rock");
        Musica musica1 = new Musica("Musica1", 15.00);
        Musica musica2 = new Musica("Musica2", 15.10);
        Musica musica3 = new Musica("Musica3", 15.30);
        Empresario empresario1 = new Empresario("Paulo", 88833003);
        Membro membro1 = new Membro("Marcio", "Guitarrista");
        Membro membro2 = new Membro("Marcelo", "Baterista");
        Membro membro3 = new Membro("Marcos", "Vocalista");

        banda1.addMembroNovo(membro1);
        banda1.addMembroNovo(membro2);
        banda1.addMembroNovo(membro3);

        banda1.addMusicaNova(musica1);
        banda1.addMusicaNova(musica2);
        banda1.addMusicaNova(musica3);

        banda1.mostraInfo();
    }
}