import java.util.Arrays;
import java.util.Scanner;

public class Ex80 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] Q = new Integer[20];
        Integer pos = 0;

        for(int x = 0; x < Q.length; x++){
            System.out.println("Digite o valor para a posicao " + (x+1) + ": ");
            Q[x] = input.nextInt();
        }
        Integer maior = Q[0];
        for(int x = 0; x < Q.length; x++){
            if(maior < Q[x]){
                maior = Q[x];
                pos = x;
            }
        }
        System.out.println("Vetor: " + Arrays.toString(Q));
        System.out.println("Maior numero no vetor: " + maior + ". Sua posicao: " + pos);
    }
}
