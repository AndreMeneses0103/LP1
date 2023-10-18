public class Ex77 {
    public static void main(String[] args) {
        int[] v = {5, 1, 4, 2, 7, 8, 3, 6};
        for (int i = 7; i >= 4; i--) {
            int aux = v[i];
            v[i] = v[7 - i + 1];
            v[6 - i + 1] = aux;
        }

        v[2] = v[0];
        v[v[2]] = v[v[1]];

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " ");
        }
    }
}
