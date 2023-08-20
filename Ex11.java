import java.util.Scanner;

public class Ex11 {
    
    public static double calcularComissaoFixa(int numeroCarrosVendidos, double valorPorCarroVendido) {
        return numeroCarrosVendidos * valorPorCarroVendido;
    }

    public static double calcularComissaoPercentual(double valorTotalVendas) {
        return 0.05 * valorTotalVendas;
    }

    public static double calcularSalarioFinal(double salarioFixo, double comissaoFixa, double comissaoPercentual) {
        return salarioFixo + comissaoFixa + comissaoPercentual;
    }

    public static void exibirSalarioFinal(double salarioFinal) {
        System.out.println("O salário final do vendedor é: " + salarioFinal);
    }
    public static void main(String[] args) {
        Scanner nx = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int numeroCarrosVendidos = nx.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = nx.nextDouble();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = nx.nextDouble();

        System.out.print("Digite o valor por carro vendido: ");
        double valorPorCarroVendido = nx.nextDouble();

        double comissaoFixa = calcularComissaoFixa(numeroCarrosVendidos, valorPorCarroVendido);
        double comissaoPercentual = calcularComissaoPercentual(valorTotalVendas);
        double salarioFinal = calcularSalarioFinal(salarioFixo, comissaoFixa, comissaoPercentual);

        exibirSalarioFinal(salarioFinal);

        nx.close();
    }

}
