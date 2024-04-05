public class Bruxa extends Monstro{
    Feitiço feitiços[];
    public boolean aprenderFeitico(String nome, int poder)
    {
        Feitiço feitico = new Feitiço();
        feitico.setNome(nome);
        feitico.setPoder(poder);
        int aux = 0;
        for (int i = 0; i < feitiços.length; i++) {
            if(feitiços[i] == null)
            {
                feitiços[i] = feitico;
                aux++;
                break;
            }
        }
        if(aux == 0)
        {
            System.out.println("Não foi possível adicionar feitiço. Bruxa não pode aprender mais feitiços");
            return false;
        }
        else
        {
            System.out.println("Bruxa aprendeu novo feitiço!");
            return true;
        }
    }
    public void listarFeiticos()
    {
        System.out.println("Segue a lista de feitiços da bruxa:");
        for (int i = 0; i < feitiços.length; i++) {
            if(feitiços[i] != null)
            {
                System.out.println("Nome do feitiço: " + feitiços[i].getNome());
                System.out.println("Poder do feitiço: " + feitiços[i].getPoder());
            }
        }
    }
    public void esquecerFeiticos(int posicao)
    {
        if(feitiços[posicao] != null)
            {
                feitiços[posicao] = null;
                System.out.println("Feitiço esquecido");
            }
        else
        {
            System.out.println("Não existe feitiço nesse slot");
        }
    }
    public void lancarFeitico(Monstro monstro_alvo, int posicao)
    {
        if(feitiços[posicao] != null)
        {
            System.out.println("Ataque bem sucedido ao monstro!");
            monstro_alvo.setVida(monstro_alvo.getVida() - feitiços[posicao].getPoder());
            super.setEnergia(super.getEnergia() - feitiços[posicao].getPoder());
        }
        else
        {
            System.out.println("Não existe feitiço nesse slot. Ataque não executado!");
        }
    }
    public Bruxa(int idade, int vida, int energia) {
        super(idade, vida, energia);
        feitiços = new Feitiço[10];
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        listarFeiticos();
    }
}
