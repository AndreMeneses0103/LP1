
public class Ex2 {
    public static void exA() {
        System.out.println("a)");
        int a = 10;
        int b = 20;
        System.out.println("B = " + b);
        b = 5;
        System.out.println("A = " + a + " B = " + b);
        System.out.println("--------------------------------");
    }
    
    public static void exB() {
        System.out.println("b)");
        int a = 30;
        int b = 20;
        int c = a + b;
        System.out.println("C = " + c);
        b = 10;
        System.out.println("B = " + b + " C = " + c);
        c = a + b;
        System.out.println("A = " + a + " B = " + b + " C = "+c);
        System.out.println("--------------------------------");
    }

    public static void exC() {
        System.out.println("c)");
        int a = 10;
        int b = 20;
        int c = a;
        b = c;
        a = b;
        System.out.println("A = "+ a + " B = "+b+" C = "+ c);
        System.out.println("--------------------------------");
    }

    public static void exD() {
        System.out.println("d)");
        int a = 10;
        int b = a + 1;
        a = b + 1;
        b = a + 1;
        System.out.println("A = " + a);
        a = b + 1;
        System.out.println("A = " + a + " B = "+b);
        System.out.println("--------------------------------");
    }
    
    public static void exE() {
        System.out.println("e)");
        int a = 10;
        int b = 5;
        int c = a + b;
        b = 20;
        a = 10;
        System.out.println("A = " + a + " B = "+ b + " C = " + c);
        System.out.println("--------------------------------");
    }
    
    public static void exF() {
        System.out.println("f)");
        int x = 1;
        int y = 2;  
        int z = y - x;
        System.out.println("Z = " + z);
        x = 5;
        y = x + z;
        System.out.println("X = " + x +" Y = "+ y + " Z = " + z);
        System.out.println("--------------------------------");
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