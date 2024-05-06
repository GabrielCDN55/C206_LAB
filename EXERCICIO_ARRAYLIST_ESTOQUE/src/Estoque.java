import java.util.ArrayList;

public class Estoque {
    private ArrayList<Item> ItensArray = new ArrayList<>();
    public ArrayList<Item> getItensArray() {
        return ItensArray;
    }
    public void setItensArray(ArrayList<Item> itensArray) {
        ItensArray = itensArray;
    }
    public void adicionarArray(Item item)
    {
        ItensArray.add(item);
        System.out.println("Item " + item.getNome() + " Adicionado ao estoque!");
    }
    public void buscar(int posicao)
    {
        if (ItensArray.get(posicao) == null)
        {
            System.out.println("Item não encontrado!");
        }
        else
        {
            System.out.println("Item " + ItensArray.get(posicao).getNome() + " Encontrado!");
        }
    }
    public void deletar(int posicao)
    {
        if (ItensArray.get(posicao) == null)
        {
            System.out.println("Item não encontrado! Não foi removido!");
        }
        else
        {
            ItensArray.remove(posicao);
            System.out.println("Item removido!");
        }
    }
    public void deletar(Item item)
    {
        if(ItensArray.contains(item) == true)
        {
            ItensArray.remove(item);
            System.out.println("Item removido!");
        }
        else
        {
            System.out.println("Item não encontrado!");
        }

    }
    public void modificar(Item item, int posicao)
    {
        ItensArray.set(posicao, item);
    }
    public void mostraEstoque()
    {
        for(Item item : ItensArray)
        {
            System.out.println("Nome do item: " + item.getNome() + " ------ Valor do item: " + item.getValor());
        }
    }

}
