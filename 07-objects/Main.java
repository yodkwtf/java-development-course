public class Main {
  public static void main(String[] args) {
    // # NON CONSTRUCTOR WAY
    // Car nissan = new Car();
    // nissan.make = "Nissan";
    // nissan.price = 10000;
    // nissan.year = 2020;
    // nissan.color = "Green";

    // Car toyota = new Car();
    // toyota.make = "Toyota";
    // toyota.price = 20000;
    // toyota.year = 2021;
    // toyota.color = "Red";

    // # CONSTRUCTOR WAY
    String[] spareParts = new String[] { "Tires", "Keys" };

    Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);
    Car toyota = new Car("Toyota", 20000, 2021, "Red", spareParts);

    Car nissan2 = new Car(nissan);
    nissan2.setColor("Yellow");

    // When we make the class fields private, we can't access the variables directly
    // System.out.println(nissan.make); // Nissan
    // System.out.println(nissan.price); // 10000.0
    // System.out.println(nissan.year); // 2020
    // System.out.println(nissan.color); // Green

    // System.out.println(toyota.make); // Toyota
    // System.out.println(toyota.price); // 20000.0
    // System.out.println(toyota.year); // 2021
    // System.out.println(toyota.color); // Red

    // # GETTERS
    System.out.println(nissan.getMake()); // Nissan
    System.out.println(nissan.getPrice()); // 10000.0
    System.out.println(nissan.getYear()); // 2020
    System.out.println(nissan.getColor()); // Green

    System.out.println(toyota.getMake()); // Toyota
    System.out.println(toyota.getPrice()); // 20000.0
    System.out.println(toyota.getYear()); // 2021
    System.out.println(toyota.getColor()); // Red

    // # SETTERS
    nissan.setMake("Nissan Altima");
    nissan.setPrice(nissan.getPrice() + 1000);

    System.out.println("\n" + nissan.getMake()); // Nissan Altima
    System.out.println(nissan.getPrice()); // 11000.0

    // # METHODS
    nissan.drive(); // Driving a Green Nissan Altima...

    System.out.println(nissan);
    System.out.println(nissan2);
  }
}