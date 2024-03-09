import java.util.Scanner;

public class Cliente {

    private String nome;
    private String cpf;
    private Conta conta;

    public Conta setConta(Conta conta) {
        this.conta = conta;
        return conta;
    }

    public Conta getConta() {
        return conta;
    }

    public boolean sacarDinheiro(double valor)
    {
        if(conta.getSaldo() >= valor)
        {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque bem sucedido!");
            return true;
        }
        else
        {
            System.out.println("Saldo insufiente! Não foi possível sacar a quantia");
            return false;
        }
    }
    public void depositarDinheiro(double valor)
    {
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Valor de " + valor + " adicionado a conta com sucesso!");
    }
    public boolean comprarComCredito(double valor)
    {
        if(conta.getLimite() >= valor)
        {
            System.out.println("Compra realizada com sucesso!");
            return true;
        }
        else
        {
            System.out.println("Compra não realizada. Verifique o limite!");
            return false;
        }
    }
    public boolean transferir(Conta contaParaReceber)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor que deseja transferir:");
        double valorTranferido = entrada.nextDouble();

        if(this.conta.getSaldo() >= valorTranferido)
        {
            this.conta.setSaldo(conta.getSaldo() - valorTranferido);
            contaParaReceber.setSaldo(contaParaReceber.getSaldo() + valorTranferido);
            System.out.println("Transferencia realizada!");
            return true;
        }
        else
        {
            System.out.println("Transferencia não realizada! Saldo insuficiente");
            return false;
        }
    }
    public String toString()
    {
        return "Nome:" + nome + " CPF:" + cpf + " Dados bancários - " + conta.toString();
    }

    public Cliente(String nome, String cpf,double limite, double saldo) {
        conta = new Conta(limite, saldo);
        this.nome = nome;
        this.cpf = cpf;
    }
}
