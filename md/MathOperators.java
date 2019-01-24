package md;

public class MathOperators {

    public static void main(String[] main) throws Exception {
        int x = 5;
        int y = 10;
        int z = ++x * y--;
        if (z != 60) {
            throw new Exception("z");
        }
        if (false && z == 2) {
            throw new Exception("zz");
        }
        if (z % 10 == 0 || --z % 11 == 0) {
            if (z != 60) {
                throw new Exception("zzz");
            }
        }
    }

}
