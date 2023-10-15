import java.util.Scanner;

public class Ex78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[10];

        for(int x = 0; x < nomes.length; x++){
            System.out.println("Digite um nome: ");
            nomes[x] = input.nextLine();
        }

        String pessoa = "";
        Integer encontra = 0;
        System.out.println("Digite o nome da pessoa a ser buscada: ");
        pessoa = input.nextLine();

        for(int x = 0; x < nomes.length; x++){
            if(nomes[x].equals(pessoa)){
                encontra = 1;
            }
        }

        if(encontra == 1){
            System.out.println("ACHEI");
        }else{
            System.out.println("NAO ACHEI");
        }
    }
}
