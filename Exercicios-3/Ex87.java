import java.util.Arrays;
import java.util.Scanner;

public class Ex87 {
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
        
        Integer[] novos_valores = new Integer[valores.length + 1];

        for (int x = 0; x< valores.length; x++){
            novos_valores[x] = valores[x];
        }

        System.out.println("Digite o novo numero: ");
        novos_valores[novos_valores.length-1] = input.nextInt();

        System.out.println("Nova array nao ordenada -> " + Arrays.toString(novos_valores));

        for(int y = 0; y < novos_valores.length; y++){
            for(int z = 0; z < novos_valores.length - 1; z++){
                if(novos_valores[z] > novos_valores[z+1]){
                    Integer temporario = novos_valores[z];
                    novos_valores[z] = novos_valores[z+1];
                    novos_valores[z+1] = temporario;
                }
            }
        }

        System.out.println("Nova array ordenada -> " + Arrays.toString(novos_valores));
    }

}
