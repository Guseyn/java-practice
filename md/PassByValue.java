package md;

public class PassByValue {

    public static void main(String[] main) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int[] array = new int[3];
        JJ jj = new JJ();
        value(list, array, jj);
        System.out.println(list.size());
        System.out.println(array.length);
        System.out.println(jj.jj);
    }

    private static void value(java.util.ArrayList<String> list, int[] array, JJ jj) {
        list.add("ok");
        array[0] = 2;
        list = new java.util.ArrayList<String>();
        array = new int[10];
        jj.jj = 2;
        jj = new JJ();
        return;
    }

}

class JJ {
    public int jj;
}
