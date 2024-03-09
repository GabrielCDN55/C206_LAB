public class Conta {
    private double saldo;
    private double limite;
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String toString()
    {
        return "Saldo da conta:" + saldo + " Limite da conta:" + limite;
    }
    public Conta(double limite, double saldo)
    {
        this.limite = limite;
        this.saldo = saldo;
    }
}
