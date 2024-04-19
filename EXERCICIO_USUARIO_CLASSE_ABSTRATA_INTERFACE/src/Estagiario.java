public class Estagiario extends Usuario implements CalculaSalario{
    private int numDeHorasTrabalhadas;
    public Estagiario(int id, int senha, int numDeHorasTrabalhadas) {
        super(id, senha);
        this.numDeHorasTrabalhadas = numDeHorasTrabalhadas;
    }
    @Override
    public float calculaSalario() {
        System.out.println("Estagiario ganhou: " + numDeHorasTrabalhadas * 50);
        return numDeHorasTrabalhadas * 50;
    }
    @Override
    public void logar() {
        System.out.println("Estagiario logando com seu crachá!");
    }
}
