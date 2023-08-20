import java.util.Scanner;

public class Ex7 {
    public static int calculo(int a, int m, int d) {
        int total = d + (m * 30) + (a * 360);
        return total;
    }

    public static void printar(int vfim){
        System.out.println("Voce tem " + vfim + " dias de vida");
    }
    public static void main(String[] args) {
        Scanner nx = new Scanner(System.in);
        int fim;
        System.out.print("Digite quantos anos voce tem: ");
        int anos = nx.nextInt();
        System.out.print("Digite quantos meses voce tem: ");
        int meses = nx.nextInt();
        System.out.print("Digite quantos dias voce tem: ");
        int dias = nx.nextInt();
        fim = calculo(anos, meses, dias);
        printar(fim);
        nx.close();
    }
}