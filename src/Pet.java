public class Pet {
  String type;
  String breed;
  String name;

  // ввызываем сочитанием клавиш alt + insert
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
