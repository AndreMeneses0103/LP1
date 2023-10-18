import java.util.ArrayList;
import java.util.List;

public class Ex77L {
    public static void main(String[] args) {
        List<Integer> v = new ArrayList<>();
        v.add(5);
        v.add(1);
        v.add(4);
        v.add(2);
        v.add(7);
        v.add(8);
        v.add(3);
        v.add(6);

        for (int i = 7; i >= 4; i--) {
            int aux = v.get(i);
            v.set(i, v.get(7 - i + 1));
            v.set(6 - i + 1, aux);
        }

        v.set(2, v.get(0));
        v.set(v.get(2), v.get(v.get(1)));

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i) + " ");
        }
    }
}
