import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex78L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        for (int x = 0; x < 10; x++) {
            System.out.println("Digite um nome: ");
            nomes.add(input.nextLine());
        }

        String pessoa = "";
        boolean encontrou = false;
        System.out.println("Digite o nome da pessoa a ser buscada: ");
        pessoa = input.nextLine();

        for (int x = 0; x < nomes.size(); x++) {
            if (nomes.get(x).equals(pessoa)) {
                encontrou = true;
                break;
            }
        }

        if (encontrou) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NAO ACHEI");
        }
    }
}
