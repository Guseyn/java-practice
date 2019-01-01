package assessment;
import java.util.List;
import java.util.ArrayList;

class Task7 {
  public static void main(String[] main) {
    int[] array = {6,9,8};
    List<Integer> list = new ArrayList<>();
    list.add(array[0]);
    list.add(array[2]);
    list.set(1, array[1]);
    list.remove(0);
    System.out.println(list);
  }
}
