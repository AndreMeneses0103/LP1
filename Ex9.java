import java.util.Scanner;

public class Ex9 {
    public static void calculo(float i, float x) {
        System.out.println("O salario reajustado sera: " + ((i*(x+100)/100)) + " reais");
    }

    public static void main(String[] args) {
        float sal;
        float reaj;
        Scanner nx = new Scanner(System.in);
        System.out.println("Digite o salario atual: ");
        sal = nx.nextFloat();
        System.out.println("Digite o reajuste (%): ");
        reaj = nx.nextFloat();
        calculo(sal, reaj);
        nx.close();
    }
}