public class Pet {
  String type;
  String breed;
  String name;

  @Override   // переопредиление
  public String toString() {
    return "Pet{" +
        "вид = " + type +   //  type
        ", порода = " + breed +    // breed
        ", имя = " + name +   // name
        ", вес = " + weight +  // weight
        '}';
  }

  double weight;
}
