public class Calculadora {

    private static float PI = 3.14f;

    public static double circunferencia(double raio)
    {
        return (2*PI*raio);
    }
    public static double volumeEsfera(double raio)
    {
        return ((4/3)*PI*raio*raio*raio);
    }
    public static double volumeCilindro(double raio, double altura)
    {
        return (PI*raio*raio*altura);
    }
    
}
