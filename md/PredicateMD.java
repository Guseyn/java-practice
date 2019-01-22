package md;

public class PredicateMD {

    public static void main(String[] main) {
        System.out.println(value(p -> p < 0, -10));
        System.out.println(value((p) -> p < 0, -10));
        System.out.println(value((Integer p) -> p > 0, -10));
        System.out.println(value(p -> {return p == 0;}, -10));
    }

    private static int value(java.util.function.Predicate<Integer> p, int a) {
        return p.test(a) ? 0 : 1;
    }

}
