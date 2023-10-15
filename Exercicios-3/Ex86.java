import java.util.Arrays;
import java.util.Scanner;

public class Ex86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer[] valores = new Integer[10];

        for(int x = 0; x < valores.length; x++){
            System.out.println("Digite um numero: ");
            valores[x] = input.nextInt();
        }

        System.out.println("Array nao ordenada -> " + Arrays.toString(valores));

        for(int y = 0; y < valores.length; y++){
            for(int z = 0; z < valores.length - 1; z++){
                if(valores[z] > valores[z+1]){
                    Integer temporario = valores[z];
                    valores[z] = valores[z+1];
                    valores[z+1] = temporario;
                }
            }
        }

        System.out.println("Array ordenada -> " + Arrays.toString(valores));
    }
}