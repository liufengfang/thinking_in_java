package typeinfo;//: typeinfo/ClassCasts.java

class Building {}
class House extends Building {}

public class ClassCasts {
  public static void main(String[] args) throws IllegalAccessException, InstantiationException {
    Building b = new House();
    Class<House> houseClass= House.class;
    House h = houseClass.cast(b);
    h = (House)b; // ... or just do this.
  }
} ///:~
