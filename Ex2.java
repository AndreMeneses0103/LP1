
public class Ex2 {
    public static void exA() {
        int a = 10;
        int b = 20;
        System.out.println("B = " + b);
        b = 5;
        System.out.println("A = " + a + " e B = " + b);
    }
    
    public static void exB() {
        int a = 30;
        int b = 20;
        int c = a + b;
        System.out.println("C = " + c);
        b = 10;
        System.out.println("B = " + b + " e C = " + c);
        c = a + b;
        System.out.println("A = " + a + " e B = " + b + " e C = "+c);
    }

    public static void exC() {
        int a = 10;
        int b = 20;
        int c = a;
        b = c;
        a = b;
        System.out.println("A = "+ a + " e B = "+b+" e C = "+ c);
    }

    public static void exD() {
        int a = 10;
        int b = a + 1;
        a = b + 1;
        b = a + 1;
        System.out.println("A = " + a);
        a = b + 1;
        System.out.println("A = " + a + " B = "+b);
    }
    
    public static void exE() {
        int a = 10;
        int b = 5;
        int c = a + b;
        b = 20;
        a = 10;
        System.out.println("A = " + a + " B = "+ b + " C = " + c);
    }
    
    public static void exF() {
        int x = 1;
        int y = 2;
        int z = y - x;
        System.out.println("Z = " + z);
        x = 5;
        y = x + z;
        System.out.println("X = " + x +" Y = "+ y + " Z = " + z);
    }

    
    public static void main(String[] args) {
        exA();
        exB();
        exC();
        exD();
        exE();
        exF();
    }
    
}