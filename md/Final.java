package md;

public class Final {

    public static void main(String[] main) {
        Integer a = 10;
        System.out.println(value(a));
    }

    private static int value(final Integer a) {
        //a = a * 2;
        return a;
    }

}
