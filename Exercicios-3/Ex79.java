import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float[] notas = new Float[20];

        Float total = 0f;

        for(int x = 0; x < notas.length; x++){
            System.out.println("Digite a nota do aluno " + (x+1) + ": ");
            notas[x] = input.nextFloat();
            total += notas[x];
        }

        Float media = total/20;
        Integer acima = 0;

        System.out.println("Media total da sala: " + media);

        for(int x = 0; x < notas.length; x++){
            if(notas[x] > media){
                acima++;
            }
        }

        System.out.println(acima + " alunos ficaram acima da media.");
    }

}
