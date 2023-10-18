import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex82L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> A = new ArrayList<>();

        for (int x = 0; x < 10; x++) {
            System.out.println("Digite o valor para a posição " + (x + 1) + ": ");
            int valor = input.nextInt();
            A.add(valor);
        }

        System.out.println("Digite o valor para multiplicar na lista: ");
        int num = input.nextInt();

        List<Integer> M = new ArrayList<>();
        for (int x = 0; x < A.size(); x++) {
            M.add(A.get(x) * num);
        }

        System.out.println("Lista com multiplicação: " + M);
    }
}
