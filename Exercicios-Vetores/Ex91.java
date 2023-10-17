import java.util.Arrays;
import java.util.Scanner;

public class Ex91 {
    public static void main(String[] args) {
        Integer[] VET = new Integer[50];
        Scanner input = new Scanner(System.in);

        for (int z = 0; z < 50; z++) {
            System.out.print("Digite um numero: ");
            Integer x = input.nextInt();
            VET[z] = x;
        }
        for (int a = 0; a < VET.length; a++) {
            int conta = 0;

            for (int b = 0; b < VET.length; b++) {
                int numero_repetir = VET[a];
                if (numero_repetir == VET[b]) {
                    conta++;
                }
            }

            boolean jaImprimiu = false;

            for (int c = 0; c < a; c++) {
                if (VET[c] == VET[a]) {
                    jaImprimiu = true;
                    break;
                }
            }

            if (conta > 1 && !jaImprimiu) {
                System.out.println("NUMERO " + VET[a] + " repete " + conta + " vezes.");
            }
        }
    }
}
