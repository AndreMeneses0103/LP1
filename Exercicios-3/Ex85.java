import java.util.Scanner;

public class Ex85 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double[] temperaturas = new Double[365];
        Double menor_temp;
        Double maior_temp;
        Double media = (double) 0;
        Integer num_dias = 0;

        for(int x = 0; x < temperaturas.length; x++){
            System.out.println("Digite a temperatura do dia " + (x+1) + ": ");
            temperaturas[x] = input.nextDouble();
        }
        menor_temp = temperaturas[0];
        maior_temp = temperaturas[0];

        for(int x = 0; x < temperaturas.length; x++){
            if(temperaturas[x] < menor_temp){
                menor_temp = temperaturas[x];
            }
        }

        for(int x = 0; x < temperaturas.length; x++){
            if(temperaturas[x] > maior_temp){
                maior_temp = temperaturas[x];
            }
        }

        for(int x = 0; x < temperaturas.length; x++){
            media += temperaturas[x];
        }

        media = media/(temperaturas.length);

        for(int x = 0; x < temperaturas.length; x++){
            if(temperaturas[x] < media){
                num_dias++;
            }
        }

        System.out.println("MENOR TEMPERATURA: " + menor_temp);
        System.out.println("MAIOR TEMPERATURA: " + maior_temp);
        System.out.println("MEDIA ANUAL: " + media);
        System.out.println("NUMERO DE DIAS EM QUE A TEMPERATURA FOI MENOR QUE A MEDIA: " + num_dias);

    }
}
