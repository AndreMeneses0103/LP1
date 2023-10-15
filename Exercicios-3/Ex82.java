import java.util.Arrays;
import java.util.Scanner;

public class Ex82 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] A = new Integer[10];

        for(int x = 0; x < A.length; x++){
            System.out.println("Digite o valor para a posicao " + (x+1) + ": ");
            A[x] = input.nextInt();
        }

        System.out.println("Digite o valor para multiplicar no vetor: ");
        Integer num = input.nextInt();

        Integer[] M = new Integer[10];
        for(int x = 0; x < A.length; x++){
            M[x] = A[x] * num;
        }

        System.out.println("Array com multiplicacao: " + Arrays.toString(M));
    }
}
