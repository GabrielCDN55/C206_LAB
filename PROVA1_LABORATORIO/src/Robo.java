public class Robo {
    private int energia;
    private String nome;
    private static int totalDeRobos = 0;
    private int energiaMaxima;
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTotalDeRobos() {
        return totalDeRobos;
    }
    public void setTotalDeRobos(int totalDeRobos) {
        this.totalDeRobos = totalDeRobos;
    }
    public int getEnergiaMaxima() {
        return energiaMaxima;
    }
    public void setEnergiaMaxima(int energiaMaxima) {
        this.energiaMaxima = energiaMaxima;
    }
    public Robo(int energia, String nome, int energiaMaxima) {
        this.energia = energia;
        this.nome = nome;
        this.energiaMaxima = energiaMaxima;
    }
    public void trabalhar()
    {
        if(energia >= 10)
        {
            System.out.println("Robo trabalhou e perdeu 10 unidades de energia");
            energia -= 10;
            System.out.println("Energia restante: " + energia);
        }
        else
        {
            System.out.println("Robo não possui energia suficiente para trabalhar! Necessário recarregar");
        }
    }
    public void trocarEnergia(Robo roboAlvo)
    {
        if(energia >= 20)
        {
            if((roboAlvo.energia + 20) <= roboAlvo.energiaMaxima)
            {
                roboAlvo.setEnergia(roboAlvo.getEnergia() + 20);
                energia -= 20;
            }
            else
            {
                System.out.println("Energia do robo alvo excederá o limite permitido! Risco de explosão! Operação cancelada");
            }
        }
        else
        {
            System.out.println("Robo não possui energia suficiente para ser trocada");
        }
    }
    public void recarregar(int horas)
    {
        if((energia + (horas * 10)) <= energiaMaxima)
        {
            energia = energia + (horas * 10);
            System.out.println("Robo carregado em: " + (horas * 10) +" unidades de energia");
        }
        else
        {
            System.out.println("Robo não pode carregar por tanto tempo. Necessário ajustar a quantidade de horas");
            System.out.println("Energia atual do Robo: " + energia);
            System.out.println("Energia maxima do Robo: " + energiaMaxima);
            System.out.println("Robo irá carregar 10 unidades de energia para cada hora");
        }
    }
    public void mostraInfo()
    {
        System.out.println("Nome do robo: " + nome + " Energia atual do robo: " + energia + " Energia maxima do Robo: " + energiaMaxima);
    }
}
