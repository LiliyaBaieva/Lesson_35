public class Main {
  public static void main(String[] args) {
   // Пример создания классов
    //  Создание классов внутри класса main

    class Car{
      String brand;
      String color;
      int year;
      String type;
    }

    Car myCar = new Car();
    myCar.brand = "VW";
    myCar.color = "Grey";
    myCar.year = 2008;
    myCar.type = "Sedan";

    System.out.println("Марка моего автомобиля " + myCar.brand +
        ", цвет моего автомобиля " + myCar.color);


  }

















}