public class Item implements Comparable<Item> {
    public Item(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }
    private int valor;
    private String nome;
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public int compareTo(Item o) {
        return Integer.compare(valor,o.getValor());
    }
}
