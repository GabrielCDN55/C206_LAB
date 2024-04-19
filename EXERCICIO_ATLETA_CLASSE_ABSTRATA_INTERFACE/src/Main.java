public class Main {
    public static void main(String[] args) {
        Nadador nadador1 = new Nadador("Paulo", 23, "Borboleta");
        Corredor corredor1 = new Corredor("Jorge", 45, 20);
        Ciclista ciclista1 = new Ciclista("Tales", 25, "Grande");


        nadador1.treinar();
        ciclista1.treinar();
        corredor1.treinar();

        corredor1.colocarEquipamento();
        ciclista1.colocarEquipamento();

    }
}