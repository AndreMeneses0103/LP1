import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex91L {
    public static void main(String[] args) {
        List<Integer> VET = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int z = 0; z < 50; z++) {
            System.out.print("Digite um número: ");
            int x = input.nextInt();
            VET.add(x);
        }

        for (int a = 0; a < VET.size(); a++) {
            int conta = 0;

            for (int b = 0; b < VET.size(); b++) {
                int numero_repetir = VET.get(a);
                if (numero_repetir == VET.get(b)) {
                    conta++;
                }
            }

            boolean jaImprimiu = false;

            for (int c = 0; c < a; c++) {
                if (VET.get(c) == VET.get(a)) {
                    jaImprimiu = true;
                    break;
                }
            }

            if (conta > 1 && !jaImprimiu) {
                System.out.println("Número " + VET.get(a) + " repete " + conta + " vezes.");
            }
        }
    }
}
