import java.util.Comparator;
import java.util.PrimitiveIterator;

public class Pirata {
    private String nome;
    private String comidaFavorita;
    private int poder;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getComidaFavorita() {
        return comidaFavorita;
    }
    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }
    public int getPoder() {
        return poder;
    }
    public void setPoder(int poder) {
        this.poder = poder;
    }
    public Pirata(String nome, String comidaFavorita, int poder) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.poder = poder;
    }
    public void comer(Cozinheiro cozinheiro, int index)
    {
        String comidaProduzida = cozinheiro.prepararPrato(index);
        if(comidaProduzida.compareTo(comidaFavorita) <= 0)
        {
            poder += (5*2);
            System.out.println("O pirata " + nome + " comeu");
            System.out.println("Poder aumentado!");
            System.out.println("Poder atual: " + poder);
        }
        else
        {
            poder+= 5;
            System.out.println();
            System.out.println("O pirata " + nome + " comeu");
            System.out.println("Poder aumentado!");
            System.out.println("Poder atual: " + poder);
        }
    }
    public Pirata lutar(Pirata pirata)
    {
        if(pirata.getPoder() >= getPoder())
        {
            System.out.println("O pirata desafiado venceu!");
            System.out.println("Nome do vencedor: " + pirata.getNome());
            return pirata;
        }
        else
        {
            System.out.println("O pirata desafiado perdeu!");
            System.out.println("Nome do vencedor: " + getNome());
            return pirata;
        }
    }
    public void mostraInfo()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Comida favorita: " + comidaFavorita);
        System.out.println("Poder: " + poder);
    }
}
