import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex88L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> valores = new ArrayList<>();
        int repeticoes = 0;

        for (int x = 0; x < 20; x++) {
            System.out.println("Digite um número:");
            int valor = input.nextInt();
            valores.add(valor);
        }

        System.out.println("Digite o número selecionado:");
        int num_selec = input.nextInt();

        for (int y = 0; y < valores.size(); y++) {
            if (num_selec == valores.get(y)) {
                repeticoes++;
            }
        }

        if (repeticoes != 0) {
            List<Integer> novo_valores = new ArrayList<>();
            for (int z = 0; z < valores.size(); z++) {
                if (valores.get(z) != num_selec) {
                    novo_valores.add(valores.get(z));
                }
            }
            System.out.println(novo_valores);
        } else {
            System.out.println("O número selecionado não foi encontrado na lista.");
        }
    }
}
