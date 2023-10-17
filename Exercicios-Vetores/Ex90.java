import java.util.Arrays;
import java.util.Scanner;

public class Ex90 {
    public static void main(String[] args) {
        Integer[] valores = new Integer[30];
        Integer repetidos = 0;
        Scanner input = new Scanner(System.in);

        for(int x = 0; x < valores.length; x++){
            System.out.println("Digite um valor para o vetor: ");
            valores[x] = input.nextInt();
        }

        System.out.print("Digite um numero: ");
        Integer x = input.nextInt();
        
        for(int y = 0; y < valores.length; y++){
            if(valores[y] == x){
                repetidos++;
            }
        }

        if(repetidos == 0){
            System.out.println("O numero digitado nao esta incluido no vetor.");
        }else{
            System.out.println("O numero " + x + " repete " + repetidos + " vezes.");
        }
    }
}
