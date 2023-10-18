import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex90L {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>();
        int repetidos = 0;
        Scanner input = new Scanner(System.in);

        for (int x = 0; x < 30; x++) {
            System.out.println("Digite um valor para a lista: ");
            int valor = input.nextInt();
            valores.add(valor);
        }

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        for (int y = 0; y < valores.size(); y++) {
            if (valores.get(y).equals(numero)) {
                repetidos++;
            }
        }

        if (repetidos == 0) {
            System.out.println("O número digitado não está incluído na lista.");
        } else {
            System.out.println("O número " + numero + " repete " + repetidos + " vezes.");
        }
    }
}
