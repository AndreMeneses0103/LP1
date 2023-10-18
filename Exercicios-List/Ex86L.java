import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex86L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> valores = new ArrayList<>();

        for (int x = 0; x < 10; x++) {
            System.out.println("Digite um número: ");
            int valor = input.nextInt();
            valores.add(valor);
        }

        System.out.println("Lista não ordenada -> " + valores);

        for (int y = 0; y < valores.size(); y++) {
            for (int z = 0; z < valores.size() - 1; z++) {
                if (valores.get(z) > valores.get(z + 1)) {
                    int temporario = valores.get(z);
                    valores.set(z, valores.get(z + 1));
                    valores.set(z + 1, temporario);
                }
            }
        }

        System.out.println("Lista ordenada -> " + valores);
    }
}
