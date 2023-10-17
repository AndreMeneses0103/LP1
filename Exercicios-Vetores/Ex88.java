import java.util.Arrays;
import java.util.Scanner;

public class Ex88 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer[] valores = new Integer[20];
        Integer repeticoes = 0;

        for(int x = 0; x < valores.length; x++){
            System.out.println("Digite um numero");
            valores[x] = input.nextInt();
        }

        System.out.println("Digite o numero selecionado: ");
        Integer num_selec = input.nextInt();

        for(int y = 0; y < valores.length; y++){
            if(num_selec == valores[y]){
                repeticoes++;
            }
        }

        if(repeticoes != 0){
            Integer todos_indices = 0;
            Integer[] novo_valores = new Integer[20-repeticoes];
            for(int z = 0; z < valores.length; z++){
                if(valores[z] != num_selec){
                    novo_valores[todos_indices] = valores[z];
                    todos_indices++;
                }
            }
            System.out.println(Arrays.toString(novo_valores));
        }else{
            System.out.println("O numero selecionado nao foi encontrado na lista.");
        }
    }
}
