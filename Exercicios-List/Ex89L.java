import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex89L {
    public static void main(String[] args) {
        List<Integer> V1 = new ArrayList<>();
        List<Integer> V2 = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int x = 0; x < 15; x++) {
            System.out.println("Digite o número da posição " + (x + 1) + " do vetor V1: ");
            int numeroV1 = input.nextInt();
            V1.add(numeroV1);
        }
        for (int x = 0; x < 15; x++) {
            System.out.println("Digite o número da posição " + (x + 1) + " do vetor V2: ");
            int numeroV2 = input.nextInt();
            V2.add(numeroV2);
        }
        for (int x = 0; x < V1.size(); x++) {
            if (V1.get(x).equals(V2.get(x))) {
                System.out.println("V1 pos " + x + " val " + V1.get(x) + " // V2 pos " + x + " val " + V2.get(x));
            }
        }
    }
}
