package assessment;

class Chicken {}
interface HenHouse { public java.util.List<Chicken> getChickens(); }
class HenHouseWith3Chicken implements HenHouse {
  public java.util.List<Chicken> getChickens () {
    return new java.util.ArrayList(){{
      add(new Chicken());
      add(new Chicken());
      add(new Chicken());
    }};
  }
}
public class ChickenSong {
  public static void main (String[] args) {
    HenHouse house = new HenHouseWith3Chicken();
    Chicken chicken = house.getChickens().get(0);
    for (int i = 0; i < house.getChickens().size(); chicken = house.getChickens().get(i++)) {
      System.out.println("Cluck");
    }
  }
}
