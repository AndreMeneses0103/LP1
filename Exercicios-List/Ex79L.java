import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex79L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Float> notas = new ArrayList<>();

        float total = 0f;

        for (int x = 0; x < 20; x++) {
            System.out.println("Digite a nota do aluno " + (x + 1) + ": ");
            float nota = input.nextFloat();
            notas.add(nota);
            total += nota;
        }

        float media = total / 20;
        int acima = 0;

        System.out.println("Média total da sala: " + media);

        for (int x = 0; x < notas.size(); x++) {
            if (notas.get(x) > media) {
                acima++;
            }
        }

        System.out.println(acima + " alunos ficaram acima da média.");
    }
}
