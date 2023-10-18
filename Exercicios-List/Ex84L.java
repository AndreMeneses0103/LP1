import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex84L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho da lista: ");
        int num_lista = input.nextInt();

        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> Soma = new ArrayList<>();

        for (int x = 0; x < num_lista; x++) {
            System.out.println("Digite o valor da posição (A) " + (x + 1) + ": ");
            int valorA = input.nextInt();
            A.add(valorA);
        }

        for (int x = 0; x < num_lista; x++) {
            System.out.println("Digite o valor da posição (B) " + (x + 1) + ": ");
            int valorB = input.nextInt();
            B.add(valorB);
        }

        System.out.println("Lista A -> " + A);
        System.out.println("Lista B -> " + B);

        for (int x = 0; x < num_lista; x++) {
            Soma.add(A.get(x) + B.get(x));
        }

        System.out.println("A lista da soma -> " + Soma);
    }
}
