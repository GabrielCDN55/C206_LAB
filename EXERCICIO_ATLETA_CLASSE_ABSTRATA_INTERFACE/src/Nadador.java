public class Nadador extends Atleta{
    private String tipoDeNado;

    public Nadador(String nome, int idade, String tipoDeNado) {
        super(nome, idade);
        this.tipoDeNado = tipoDeNado;
    }
    public String getTipoDeNado() {
        return tipoDeNado;
    }
    public void setTipoDeNado(String tipoDeNado) {
        this.tipoDeNado = tipoDeNado;
    }
    @Override
    public void treinar() {
        System.out.println("Treinando na água!");
    }
}
