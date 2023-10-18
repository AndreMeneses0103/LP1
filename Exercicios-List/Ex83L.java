import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex83L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();

        for (int x = 0; x < 20; x++) {
            System.out.print("Digite o valor para a posição " + (x + 1) + ": ");
            int valor = input.nextInt();
            lista.add(valor);
        }

        System.out.println("Lista criada: " + lista);

        int tamanho = lista.size();
        for (int x = 0; x < tamanho / 2; x++) {
            int temporario = lista.get(x);
            lista.set(x, lista.get(tamanho - x - 1));
            lista.set(tamanho - x - 1, temporario);
        }

        System.out.print("Lista invertida: ");
        for (int x = 0; x < tamanho; x++) {
            System.out.print(lista.get(x));
            if (x < tamanho - 1) {
                System.out.print(", ");
            }
        }
    }
}
