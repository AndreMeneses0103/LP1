import java.util.Arrays;
import java.util.Scanner;

public class Ex83 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer[] vetor = new Integer[20];

        for(int x = 0; x < vetor.length; x++){
            System.out.print("Digite o valor para a posicao " + (x+1) + ": ");
            vetor[x] = input.nextInt();
        }

        System.out.println("Vetor criado: " + Arrays.toString(vetor));

        //A estrutura de repeticao pega um valor e o seu "espelho", ate chegar no meio, onde todos estarao trocados
        for(int x = 0; x < vetor.length/2; x++){
            int temporario = vetor[x];
            vetor[x] = vetor[vetor.length - x - 1];
            vetor[vetor.length - x - 1] = temporario;
        }

        System.out.println("Vetor invertido: " + Arrays.toString(vetor));

    }
}
