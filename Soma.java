public class Soma {

    public double somar_real(double a, double b) {
        return (a + b);
    }

    public void somar_complexo(int a, int b, int c, int d) {
        int r = a + c;
        int i = b + d;
        System.out.println("A soma = " + r + i + "i");
    }
    public static void main(String[] args) {
        Soma result1 = new Soma();
        System.out.println(result1.somar_real(4, 10));
        result1.somar_complexo(5,2,7,-3);
    }
}
