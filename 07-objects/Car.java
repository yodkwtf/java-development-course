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

  // Copy Constructor
  public Car(Car source) {
    this.make = source.make;
    this.price = source.price;
    this.year = source.year;
    this.color = source.color;
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

  // Setters
  public void setMake(String make) {
    this.make = make;
    // We need `this` keyword since there is a conflicting variable of the same
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
