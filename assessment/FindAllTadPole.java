package assessment;

import java.util.*;

interface CanSwim {}
class Amphibian implements CanSwim {}
class TadPole extends Amphibian {}
public class FindAllTadPole {
  public static void main (String[] args) {
    List<TadPole> tadpoles = new ArrayList<TadPole>();
    for (Amphibian amphibian: tadpoles) {
      CanSwim canSwim = amphibian;
      Amphibian amph = amphibian;
      //TadPole tadpole = amphibian;
      Object object = amphibian;
    }
  }
} 
