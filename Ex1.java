/**
 * Ex1
 */
public class Ex1 {
    public void trocar(int vA, int vB) {
        int val = vA;
        vA = vB;
        vB = val;
        System.out.println("Valor A = " + vA + " e Valor B = "+ vB);

    }
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        Ex1 obj = new Ex1();
        obj.trocar(A, B);
    }
}