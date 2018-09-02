public class Calculadora {
    public static void main(String[] args){}

    public static int tempo(int x)
    {
        int result = x * 60;
        return result;
    }
    public static double distancia(double x)
    {
        double result = x * 0.62137;
        return result;
    }
    public static double velocidade(double x)
    {
        double result = x * 3.6;
        return result;
    }
    public static double temperatura(double x)
    {
        double result = (x - 32) / 1.8;
        return result;
    }
}
