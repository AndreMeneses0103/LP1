import java.util.Scanner;

public class Ex90 {
    public static void main(String[] args) {
        Integer[] valores = {25, 17, 42, 9, 31, 12, 5, 18, 7, 38, 14, 22, 10, 47, 6, 29, 33, 2, 21, 8, 36, 13, 19, 4, 27, 39, 16, 20, 28, 11, 25, 9, 12, 7, 33, 10, 14, 21, 7, 8, 13, 19};
        Integer repetidos = 0;
        Scanner input = new Scanner(System.in);

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
