public class Corredor extends Atleta implements Equipamento{
    private int velocidadeMaxima;

    public Corredor(String nome, int idade, int velocidadeMaxima) {
        super(nome, idade);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    @Override
    public void treinar() {
        System.out.println("Treinando na pista de corrida!");
    }
    @Override
    public void colocarEquipamento() {
        System.out.println("Colocando equipamentos de corrida");
    }
}
