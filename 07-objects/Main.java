public class Main {
  public static void main(String[] args) {
    Car nissan = new Car();
    nissan.make = "Nissan";
    nissan.price = 10000;
    nissan.year = 2020;
    nissan.color = "Green";

    Car toyota = new Car();
    toyota.make = "Toyota";
    toyota.price = 20000;
    toyota.year = 2021;
    toyota.color = "Red";

    System.out.println(nissan.make); // Nissan
    System.out.println(nissan.price); // 10000.0
    System.out.println(nissan.year); // 2020
    System.out.println(nissan.color); // Green

    System.out.println(toyota.make); // Toyota
    System.out.println(toyota.price); // 20000.0
    System.out.println(toyota.year); // 2021
    System.out.println(toyota.color); // Red
  }
}