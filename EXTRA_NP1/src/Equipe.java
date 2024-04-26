public class Equipe {
    private Carro carro;
    private Piloto pilotos[] = new Piloto[4];
    private Piloto pilotoAtual;
    private String nome;
    public Carro getCarro() {
        return carro;
    }
    private boolean trocarPilotoAtual(int pilotoId)
    {
        if(pilotos[pilotoId] != null)
        {
            pilotoAtual = pilotos[pilotoId];
            return true;
        }
        else
        {
            System.out.println("Não existe piloto com esse Id! Não foi possível trocar o piloto!");
            return false;
        }
    }
    private boolean trocarPneu(int tipoDePneu)
    {
        carro.setTipoDePneu(tipoDePneu);
        System.out.println("Tipo de pneu do carro atual alterado!");
        return true;
    }
    public void pitStop(int pilotoId, int tipoDePneu)
    {
        if(pilotos[pilotoId - 1] != null)
        {
            System.out.println("Piloto está na lista da equipe. Iniciando operações:");
            trocarPneu(tipoDePneu);
            trocarPilotoAtual(pilotoId - 1);
        }
        else
        {
            System.out.println("O piloto não está na lista da equipe! PIT-STOP não executado!");
        }
    }
    public boolean adicionarPiloto(Piloto piloto)
    {
        int aux = 0;
        for (int i = 0; i < pilotos.length; i++) {
            if(pilotos[i] == null)
            {
                pilotos[i] = piloto;
                aux = 1;
                break;
            }
        }
        if(aux == 0)
        {
            System.out.println("Não existe espaço para adicionar novo piloto! Numero máximo permitido é 4!");
            return false;
        }
        else
        {
            System.out.println("Piloto adicionado!");
            return true;
        }
    }
    public boolean retirarPiloto(int pilotoId)
    {
        if(pilotos[pilotoId - 1] != null) {
            if (pilotos[pilotoId - 1] == pilotoAtual) {
                System.out.println("Não pode remover o piloto atual, necessário PIT-STOP!");
                return false;
            }
            else
            {
                pilotos[pilotoId - 1] = null;
                System.out.println("Piloto removido!");
                return true;
            }
        }
        else
        {
            System.out.println("Não existe piloto com esse Id! Não foi removido nenhum piloto");
            return false;
        }
    }
    public Equipe(String nome) {
        this.nome = nome;
        constroiCarro(1,100, true);
    }
    public void constroiCarro(int tipoDePneu, int potencia, boolean turbo)
    {
        Carro carro = new Carro(tipoDePneu, potencia, turbo);
        this.carro = carro;
    }
    public void mostraInfo() {
        System.out.println("Nome da equipe: " + nome);
        System.out.println("Segue lista dos pilotos: ");
        for (int i = 0; i < pilotos.length; i++) {
            if(pilotos[i] != null)
            {
                pilotos[i].mostraInfo();
            }
        }
        System.out.println("O piloto atual da equipe é: " + pilotoAtual.getNome());
        System.out.println("Carro da equipe: ");
        carro.mostraInfo();
    }
}
