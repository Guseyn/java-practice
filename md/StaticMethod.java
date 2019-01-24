package md;

public class StaticMethod {

    private static void load() {
        System.out.println("load");
    }

    public static void main(String[] main) {
        new StaticMethod().load();
        StaticMethod.load();
    }

}
