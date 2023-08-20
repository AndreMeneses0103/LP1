import java.util.Scanner;
public class Ex8 {
    public static void percent(float nt, float nb, float nn, float nv) {
        System.out.println(nt);
        System.out.println("Percentual de votos brancos: " + ((nb/nt)*100) + "%");
        System.out.println("Percentual de votos nulos: " + ((nn/nt)*100) + "%");
        System.out.println("Percentual de votos validos: " + ((nv/nt)*100) + "%");
    }
    
    public static void main(String[] args) {
        float nTotal;
        float nBranco;
        float nNulo;
        float nVal;
        Scanner nx = new Scanner(System.in);
        System.out.println("Digite o numero de eleitores: ");
        nTotal = nx.nextFloat();
        System.out.println("Digite o numero de votos brancos: ");
        nBranco = nx.nextFloat();
        System.out.println("Digite o numero de votos nulos: ");
        nNulo = nx.nextFloat();
        System.out.println("Digite o numero de votos validos: ");
        nVal = nx.nextFloat();
        percent(nTotal, nBranco, nNulo, nVal);
        nx.close();
    }
}