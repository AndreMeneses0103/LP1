import java.util.Scanner;

public class Ex6 {
    public static void retangulo(float base, float altura) {
        float res = base*altura;
        System.out.println("A area do retangulo = " + (res));
    }

    public static void main(String[] args) {
        Scanner nx = new Scanner(System.in);
        System.out.println("Digite a base: ");
        float a = Float.parseFloat(nx.nextLine());
        System.out.println("Digite a altura: ");
        float b = Float.parseFloat(nx.nextLine());
        retangulo(a, b);
        nx.close();
    }
}