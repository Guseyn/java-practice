package md;

public class Initialazer {

    private static int a;
    private int b = 1;
    private static int c;

    static {
        System.out.println("static");
        //b = 2;
        a = 3;
        c = 4;
    }

    public Initialazer() {
        System.out.println("constr");
    }

    {
        System.out.println("init");
        a = a + 1;
        b = b + 1;
    }

    public static void main(String[] main) {
        Initialazer i = new Initialazer();
        System.out.println("a=" + i.a);
        System.out.println("b=" + i.b);
        System.out.println("c=" + i.c);
        Initialazer i2 = new Initialazer();
        System.out.println("a=" + i2.a);
        System.out.println("b=" + i2.b);
        System.out.println("c=" + i2.c);
    }

}
