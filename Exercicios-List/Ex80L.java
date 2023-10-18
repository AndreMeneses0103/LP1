import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex80L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> Q = new ArrayList<>();
        int pos = 0;

        for (int x = 0; x < 20; x++) {
            System.out.println("Digite o valor para a posição " + (x + 1) + ": ");
            int valor = input.nextInt();
            Q.add(valor);
        }

        int maior = Q.get(0);
        for (int x = 0; x < Q.size(); x++) {
            if (maior < Q.get(x)) {
                maior = Q.get(x);
                pos = x;
            }
        }

        System.out.println("Lista: " + Q);
        System.out.println("Maior número na lista: " + maior + ". Sua posição: " + pos);
    }
}
