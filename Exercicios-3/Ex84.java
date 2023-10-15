import java.util.Arrays;
import java.util.Scanner;

public class Ex84 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        Integer num_vetor = input.nextInt();

        Integer[] A = new Integer[num_vetor];
        Integer[] B = new Integer[num_vetor];
        Integer[] Soma = new Integer[num_vetor];

        for(int x = 0; x < A.length; x++){
            System.out.println("Digite o valor da posicao (A) " + (x+1) + ": ");
            A[x] = input.nextInt();
        }
        for(int x = 0; x < B.length; x++){
            System.out.println("Digite o valor da posicao (B) " + (x+1) + ": ");
            B[x] = input.nextInt();
        }

        System.out.println("Vetor A -> " + Arrays.toString(A));
        System.out.println("Vetor B -> " + Arrays.toString(B));

        for(int x = 0; x < Soma.length; x++){
            Soma[x] = A[x] + B[x];
        }

        System.out.println("O vetor da soma -> " + Arrays.toString(Soma));
    }
}
