public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabriel", "5555555", 1000, 4000);
        Cliente cliente2 = new Cliente("Paulo","44444", 300, 600);

        System.out.println("Cliente1: " + cliente1.toString());
        System.out.println("Cliente2: " + cliente2.toString());

        cliente1.depositarDinheiro(1000);
        cliente1.sacarDinheiro(4000);
        cliente1.comprarComCredito(5000);
        cliente1.transferir(cliente2.getConta());

        System.out.println("Saldo conta: " + cliente1.toString());
        System.out.println("Saldo conta: " + cliente2.toString());
    }
}