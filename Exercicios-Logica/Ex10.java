import java.util.Scanner;
public class Ex10 {
    public static Double calculo(Double c) {
        Double fim = c + (c * 0.28) + (c * 0.45);
        return fim;
    }

    public static void printar(Double valor){
        System.out.println("Custo Final = " + valor); 
    }

    public static void main(String[] args) {
        Scanner nx = new Scanner(System.in);
        Double custo;
        Double fim;
        System.out.println("Digite o custo do carro: ");
        custo = nx.nextDouble();
        fim = calculo(custo);
        printar(fim);
        nx.close();
    }
}