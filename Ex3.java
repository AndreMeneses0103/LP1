public class Ex3 {
    public static void letA(float a, float b) {
        System.out.println(((a/b)+(b/a)) + " e " + (a/b+b/a));
    }

    public static void letB(float a, float b) {
        System.out.println((a/(b+b)/a) + " e " + (a/b+b/a));
    }
    
    public static void letC(float a, float b) {
        System.out.println(((a+b)*b-a) + " e " + (a+b*b-a));
    }

    public static void main(String[] args) {
        float prim = 4;
        float sec = 2;
        letA(prim,sec);
        letB(prim,sec);
        letC(prim,sec);
    }
    
}