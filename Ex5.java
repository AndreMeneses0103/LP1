import java.util.*;

public class Ex5 {
    public static int antecessor(int valor) {
        return (valor - 1);
    }
    public static void main(String[] args) {
        Scanner nx = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int num = nx.nextInt();
        System.out.println("O numero antecessor -> " + antecessor(num));
        nx.close();
    }
}