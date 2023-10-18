import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex85L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        Double menor_temp;
        Double maior_temp;
        Double media = 0.0;
        Integer num_dias = 0;

        for (int x = 0; x < 365; x++) {
            System.out.println("Digite a temperatura do dia " + (x + 1) + ": ");
            Double temperatura = input.nextDouble();
            temperaturas.add(temperatura);
        }

        menor_temp = temperaturas.get(0);
        maior_temp = temperaturas.get(0);

        for (int x = 0; x < temperaturas.size(); x++) {
            if (temperaturas.get(x) < menor_temp) {
                menor_temp = temperaturas.get(x);
            }
        }

        for (int x = 0; x < temperaturas.size(); x++) {
            if (temperaturas.get(x) > maior_temp) {
                maior_temp = temperaturas.get(x);
            }
        }

        for (int x = 0; x < temperaturas.size(); x++) {
            media += temperaturas.get(x);
        }

        media = media / temperaturas.size();

        for (int x = 0; x < temperaturas.size(); x++) {
            if (temperaturas.get(x) < media) {
                num_dias++;
            }
        }

        System.out.println("MENOR TEMPERATURA: " + menor_temp);
        System.out.println("MAIOR TEMPERATURA: " + maior_temp);
        System.out.println("MEDIA ANUAL: " + media);
        System.out.println("NUMERO DE DIAS EM QUE A TEMPERATURA FOI MENOR QUE A MEDIA: " + num_dias);
    }
}
