public class Garra {
    private int pressao;
    public int getPressao() {
        return pressao;
    }
    public void setPressao(int pressao) {
        this.pressao = pressao;
    }
    public void agarrarPeca()
    {
        System.out.println("Garra está agarrando uma peça");
    }
    public void agarrarPeca(int posicao)
    {
        System.out.println("Garra está agarrando a peça na posição " + posicao);
    }
    public void mostraInfoGarra()
    {
        System.out.println("Pressão da garra do Braço: " + pressao);
    }
}
