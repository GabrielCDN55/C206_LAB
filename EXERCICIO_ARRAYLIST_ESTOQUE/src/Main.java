import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(10, "Bola");
        Item item2 = new Item(13, "Camisa");
        Item item3 = new Item(8, "Tenis");
        Item item4 = new Item(12, "Chuteira");

        Estoque estoque1 = new Estoque();
        Estoque estoque2 = new Estoque();

        estoque1.adicionarArray(item1);
        estoque1.adicionarArray(item2);
        estoque1.adicionarArray(item3);
        estoque1.adicionarArray(item4);

        // estoque1.mostraEstoque();

        // estoque1.buscar(2);
        // estoque1.deletar(item1);

        Collections.sort(estoque1.getItensArray()); //ordena
        // estoque1.mostraEstoque();

        System.out.println(Collections.max(estoque1.getItensArray()).getValor()); //retorna o maior valor do item
        System.out.println(Collections.min(estoque1.getItensArray()).getValor()); //retorna o menor valor do item

        estoque2.getItensArray().addAll(estoque1.getItensArray()); //adiciona todos os itens do estoque1 ao estoque2

        // estoque2.mostraEstoque();

        estoque1.getItensArray().removeAll(estoque1.getItensArray()); //remove todos os itens do estoque1

        estoque1.mostraEstoque();

        System.out.println(estoque2.getItensArray().indexOf(item1)); //indica em qual indice dentro do array o objeto está vinculado

        estoque2.getItensArray().forEach((item) ->{ //utilizado para saida de dados, mostrando todas as infomações dos itens contidos no array
            System.out.println("Nome do item: " + item.getNome());
            System.out.println("Valor do item: " + item.getValor());
        });

        if(estoque1.getItensArray().isEmpty() == true) //verifica se o array está vazio
        {
            estoque1.adicionarArray(item1);
            estoque1.adicionarArray(item3);
        }

        estoque1.mostraEstoque();

        System.out.println(estoque1.getItensArray().lastIndexOf(item3));

        System.out.println(estoque1.getItensArray().size()); //retorna o tamanho atual do array (quantos itens ele possui)
    }
}