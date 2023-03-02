## Inheritance

This is one of the most important aspects of OOPs.

- Allows parent class to serve as a foundation for several child classes
- Every child class inherits fields and methods from its parent

It allows us to reuse code instead of writing it over and over again.

#### Example

If 2 classes (Let's say `Shirt` and `Pants`) have a few same fields and methods (size, prices, etc.), instead of writing them in both the classes, we can create a parent class (`Product`) which can have all these fields and methods so that the child classes can inherit from it.

###### Product.java

```java
public class Product {
  private double price;
  private String color;

  // # Getters
  public double getPrice() {
    return this.price;
  }

  public String getColor() {
    return this.color;
  }

  // # Setters
  public void setPrice(double price) {
    this.price = price;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
```

Use the `extend` keyword to make the child class extend to the parent class

###### Shirt.java

```java
public class Shirt extends Product {
  private Size size;

  public enum Size {
    SMALL, MEDIUM, LARGE
  }

  public Size getSize() {
    return this.size;
  }
  public void setSize(Size size) {
    this.size = size;
  }
}
```

###### Pants.java

```java
public class Pants extends Product {
  private int length;

  public int getLength() {
    return this.length;
  }
  public void setLength(int length) {
    this.length = length;
  }
}
```

Now `Shirt` and `Pants` will inherit all the fields and methods from the `Product` class and they can be used the same as before

###### Main.java

```java
main() {
  Shirt shirt = new Shirt();
  // methods inherited from Shirt (child) class
  shirt.setSize(Size.SMALL);
  // methods inherited from Product (parent) class
  shirt.setColor("Black");

  Pants pants = new Pants();
  // methods inherited from Pants (child) class
  pants.setWaist(32);
  pants.setLength(32);
  // methods inherited from Product (parent) class
  pants.setColor("Navy Blue");
  pants.setBrand("Nike");
}
```
