package assessment;

class Task17 {
  public static void main(String[] args) {
    System.out.println(test(i -> i == 5));
    //System.out.println(test(i -> {i == 5;}));
    System.out.println(test((i) -> i == 5));
    //System.out.println(test((int i) -> {return i == 5;}));
    //System.out.println(test((int i) -> {return i == 5;}));
  }
  public static boolean test(java.util.function.Predicate<Integer> p) {
    return p.test(5);
  }
}
