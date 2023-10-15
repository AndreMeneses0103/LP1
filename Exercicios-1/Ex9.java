import java.util.Scanner;

public class Ex9 {
    public static float calculo(float i, float x) {
        float finals = (i*(x+100)/100);
        return(finals);
    }

    public static void main(String[] args) {
        float sal;
        float reaj;
        Scanner nx = new Scanner(System.in);
        System.out.println("Digite o salario atual: ");
        sal = nx.nextFloat();
        System.out.println("Digite o reajuste (%): ");
        reaj = nx.nextFloat();
        float fim = calculo(sal, reaj);
        System.out.println("O salario reajustado sera: " + (fim) + " reais");
        nx.close();
    }
}