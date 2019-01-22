package md;

public class TryCatch {

    public static void main(String[] main) {
        System.out.println(value(-10));
    }

    private static int value(int v) {
        try {
            if (v < 0) {
                v = -v;
                throw new RuntimeException();
            }
            return v;
        } catch (Exception e) {
            if (v > 0) {
                throw new RuntimeException();
            }
            return v;
        } finally {
            return v / 2;
        }
    }

}
