import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // create cars
    Car[] cars = new Car[] {
        new Car("Nissan", 5000, 2020, "red", new String[] { "tires", "keys" }),
        new Car("Dodge", 8500, 2019, "blue", new String[] { "tires", "keys" }),
        new Car("Nissan", 5000, 2017, "yellow", new String[] { "tires", "filter" }),
        new Car("Honda", 7000, 2019, "orange", new String[] { "tires", "filter" }),
        new Car("Mercedes", 12000, 2015, "jet black", new String[] { "tires", "filter", "transmission" })
    };

    // create dealership object
    Dealership dealership = new Dealership(cars);

    // print dealership info
    System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
    System.out.println("Feel free to browse through our collection of cars.\n");

    // print cars
    System.out.println(dealership);

    // get user choice
    System.out.println("Which car are you interested in? (0 - 4).\n");
    int index = scan.nextInt();

    // sell car here
    dealership.sellCar(index);

    scan.close();
  }
}