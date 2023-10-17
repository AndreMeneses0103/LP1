import java.util.Arrays;
import java.util.Scanner;

public class Ex89 {
    public static void main(String[] args) {
        Integer[] V1 = new Integer[15];
        Integer[] V2 = new Integer[15];

        Scanner input = new Scanner(System.in);

        for(int x = 0; x < V1.length; x++){
            System.out.println("Digite o numero da posicao " + (x+1) + " do vetor V1: ");
            V1[x] = input.nextInt();
        }
        for(int x = 0; x < V2.length; x++){
            System.out.println("Digite o numero da posicao " + (x+1) + " do vetor V2: ");
            V2[x] = input.nextInt();
        }
        for(int x = 0; x < V1.length; x++){
            if(V1[x] == V2[x]){
            System.out.println("V1 pos " + x + " val "+ V1[x]+ " // V2 pos "+x+" val "+ V2[x]);
            }
        }
    }
}