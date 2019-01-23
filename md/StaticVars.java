package md;

public class StaticVars {

    private static int a = 4;
    private int b = 5;
    public static void main(String[] main) {
        StaticVars s = new StaticVars();
        s.a = 5;
        s.b = 6;
        Tricky t1 = new Tricky();
        Tricky t2 = new Tricky();
        System.out.println(s.a);
        System.out.println(s.b);
        System.out.println(t1.valueOfT(t2));
    }

}

class Tricky {
    private int a = 4;
    public int valueOfT(Tricky t) {
        return t.a;
    }
}
