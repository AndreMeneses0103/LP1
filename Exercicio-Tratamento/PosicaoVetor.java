import java.util.Scanner;

public class PosicaoVetor {
    public static void main(String[] args) {
        Integer[] vetor = {1,2,3,4,5};
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Digite o indice do vetor: ");
            int num = input.nextInt();
            System.out.println("Valor do indice: " + vetor[num]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Erro ocorrido: O indice selecionado nao existe no vetor.");
        }finally{
            System.out.println("Fim do programa.");
        }
    }
}