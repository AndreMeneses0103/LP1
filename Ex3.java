public class Ex3 {
    public static void letA(float a, float b) {
        float vA = ((a/b)+(b/a));
        float vB = (a/b+b/a);
        System.out.println( vA + " e " + vB);
    }

    public static void letB(float a, float b) {
        float vA = (a/(b+b)/a);
        float vB = (a/b+b/a);
        System.out.println( vA + " e " + vB);
    }
    
    public static void letC(float a, float b) {
        float vA = ((a+b)*b-a);
        float vB = (a+b*b-a);
        System.out.println( vA + " e " + vB);
    }

    public static void main(String[] args) {
        float prim = 4;
        float sec = 2;
        letA(prim,sec);
        letB(prim,sec);
        letC(prim,sec);
    }
    
}