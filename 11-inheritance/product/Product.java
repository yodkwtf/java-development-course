package product;

public class Product {
  private double price;
  private String color;
  private String brand;

  // # Getters
  public double getPrice() {
    return this.price;
  }

  public String getColor() {
    return this.color;
  }

  public String getBrand() {
    return this.brand;
  }

  // # Setters
  public void setPrice(double price) {
    this.price = price;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  // # Methods
  public void fold() {
    System.out.println("Folding my " + this.brand + " " + this.color + " " + this.getClass().getSimpleName() + "...");
  }
}
