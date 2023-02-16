public class Car {
  private String make;
  private double price;
  private int year;
  private String color;

  // Constructor
  public Car(String make, double price, int year, String color) {
    this.make = make;
    this.price = price;
    this.year = year;
    this.color = color;
  }

  // Getters
  public String getMake() {
    return make;
    // We don't need `this` keyword since there is no conflicting variable of the
    // same name unlike we had in the constructor function
  }

  public double getPrice() {
    return price;
  }

  public int getYear() {
    return year;
  }

  public String getColor() {
    return color;
  }
}
