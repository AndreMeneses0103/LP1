import java.util.*;

public class Ex5 {
    public static int antecessor(Integer valor) {
        return (valor - 1);
    }
    public static void main(String[] args) {
        Scanner nx = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        System.out.println("O numero antecessor -> " + antecessor(Integer.parseInt(nx.nextLine())));
        nx.close();
    }
}