import java.util.Scanner;

public class Ex11 {
    
    public static double calculoComis(int nCarro, double vCarro) {
        return (nCarro * vCarro);
    }

    public static double calculoComisPerc(double total) {
        return (0.05 * total);
    }

    public static double calculoFim(double salarioF, double comis, double comisP) {
        return (salarioF + comis + comisP);
    }

    public static void exibirSalarioFinal(double salFinal) {
        System.out.println("O salário final do vendedor é: " + salFinal);
    }
    public static void main(String[] args) {
        Scanner nx = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int nCarro = nx.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double total = nx.nextDouble();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioF = nx.nextDouble();

        System.out.print("Digite o valor por carro vendido: ");
        double vCarro = nx.nextDouble();

        double comis = calculoComis(nCarro, vCarro);
        System.out.println("Comissao: " + comis);
        double comisP = calculoComisPerc(total);
        System.out.println("Comissao (Percentual): " + comisP);
        double salFinal = calculoFim(salarioF, comis, comisP);

        exibirSalarioFinal(salFinal);

        nx.close();
    }

}
