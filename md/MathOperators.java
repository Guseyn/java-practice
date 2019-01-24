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
        System.out.println(howMany());
        System.out.println(howMany(new int[]{1, 2, 3}));
        System.out.println(howMany(1, 2, 3));
        String randomString = "randomString";
        String randomString2 = "randomString";
        if (randomString != randomString2) {
            throw new Exception("excpEqStr");
        }
        if ("randomString" != randomString) {
            throw new Exception("excpEqStr2");
        }
        System.out.println(new Integer(2).equals(new String("2")));
        //System.out.println(new Integer(2) == new String("2"));
    }

    private static int howMany(int... n) {
        return n.length;
    }

}


class Rodent {
    protected static Number chew() throws Exception {
        System.out.println("Rodent is chewing"); return 1;
    }
}
class Beaver extends Rodent {
    public static Integer chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood"); return 2;
    }
}
