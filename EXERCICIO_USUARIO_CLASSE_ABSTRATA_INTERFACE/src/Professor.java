public class Professor extends Usuario implements CalculaSalario{
    private int numDeAulas;
    public Professor(int id, int senha, int numDeAulas) {
        super(id, senha);
        this.numDeAulas = numDeAulas;
    }
    @Override
    public void logar() {
        System.out.println("Professor está logando com seu crachá de professor!");
    }
    @Override
    public float calculaSalario() {
        System.out.println("Professor ganhou: " + numDeAulas * 100);
        return numDeAulas * 100;
    }
}
