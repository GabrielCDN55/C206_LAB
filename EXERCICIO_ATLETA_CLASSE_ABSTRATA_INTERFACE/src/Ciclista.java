public class Ciclista extends Atleta implements Equipamento{
    private String tipoDeBike;

    public Ciclista(String nome, int idade, String tipoDeBike) {
        super(nome, idade);
        this.tipoDeBike = tipoDeBike;
    }

    public String getTipoDeBike() {
        return tipoDeBike;
    }
    public void setTipoDeBike(String tipoDeBike) {
        this.tipoDeBike = tipoDeBike;
    }
    @Override
    public void treinar() {
        System.out.println("Treinando na bike!");

    }
    @Override
    public void colocarEquipamento() {
        System.out.println("Colocando equipamento de ciclismo");
    }
}
