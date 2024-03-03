public class Gato {

    public String cor;
    public int idade;
    public int velocidade;
    public void brincar()
    {
        System.out.println("Gato está brincando!");
    }
    public void caçar(Rato rato)
    {
        if(rato.escondido == true)
        {
            System.out.println("Gato não encontrou o rato!");
        }
        else if (rato.escondido == false)
        {
            if(this.velocidade >= rato.velocidade)
            {
                System.out.println("Rato foi pego!");
            }
            else
            {
                System.out.println("Rato é mais rápido que o gato. Gato segue com fome!");
            }
        }
    }
    public String toString()
    {
        return "Cor do gato:" + this.cor + " Idade do gato:" + this.velocidade + " Velocidade do gato:" + this.velocidade;
    }
}
