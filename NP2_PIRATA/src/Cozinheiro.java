import java.util.ArrayList;

public class Cozinheiro extends Pirata{
    private ArrayList<Receita> livroDeReceitas = new ArrayList<>();
    public Cozinheiro(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
        Receita receita1 = new Receita("Pão com manteiga", 2);
        Receita receita2 = new Receita("Bolo de fubá", 3);
        Receita receita3 = new Receita("Pizza", 5);
        Receita receita4 = new Receita("Lasanha", 6);
        livroDeReceitas.add(receita1);
        livroDeReceitas.add(receita2);
        livroDeReceitas.add(receita3);
        livroDeReceitas.add(receita4);
    }
    public String prepararPrato(int index)
    {
        return "Nome do Prato preparado: " + livroDeReceitas.get(index).getNome();
    }
    public void mostraReceitas()
    {
        System.out.println("Seguem as receitas do cozinheiro " + getNome() + ": ");
        for (Receita receita : livroDeReceitas)
        {
            try{
                System.out.println("Nome da receita: " + receita.getNome() + " ------- Dificuldade de produção: " + receita.getDificuldade());
            }catch (NullPointerException exception)
            {
                System.out.println("Lista de receitas está com páginas incompletas!");
            }
        }
    }
    @Override
    public void mostraInfo()
    {
        super.mostraInfo();
        mostraReceitas();
    }
}
