import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Ex87L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> valores = new ArrayList<>();

        for (int x = 0; x < 10; x++) {
            System.out.println("Digite um número: ");
            int valor = input.nextInt();
            valores.add(valor);
        }

        System.out.println("Lista não ordenada -> " + valores);

        Collections.sort(valores);

        System.out.println("Lista ordenada -> " + valores);

        System.out.println("Digite o novo número: ");
        int novoNumero = input.nextInt();
        valores.add(novoNumero);

        System.out.println("Nova lista não ordenada -> " + valores);

        Collections.sort(valores);

        System.out.println("Nova lista ordenada -> " + valores);
    }
}
