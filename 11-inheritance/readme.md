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

## Polymorphism

- Ability of an object to take on multiple forms
- Child objects can take the form of their parent object

#### Example

The child class `Shirt` can also be considered a `Product`

```java
// Shirt shirt = new Shirt();
Product shirt = new Shirt();
```

However, it is recommended to always use the most specific class instead of the most generic class since the specific child class (`Shirt` in our case) can also have methods of its own and they can't be called by the generic parent class.

```java
Product shirt = new Shirt();
shirt.setSize(Size.SMALL); // ❌ error

Shirt shirt = new Shirt();
shirt.setSize(Size.SMALL); // ✅ works
```

Using specific class ensures that the class can access every method from the parent class plus the additional ones from the child class.

### Why do we need Polymorphism?

- Flexible and reusable code

Now we don't have to create separate methods for both `Shirt` and `Pants` for a similar task. For example, instead of writing methods like this -

###### Main.java

```java
public static void pantStore(Pants pants) {
  System.out.println("Thank your for purchasing " + pants.getBrand() + " pants!");
}

public static void shirtStore(Shirt shirt) {
  System.out.println("Thank your for purchasing " + shirt.getBrand() + " shirt!");
}
```

We can use something like this -

###### Main.java

```java
public static void productStore(Product product) {
  System.out.println("Thank your for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName() + "!");
}
```

Instead of using the child class specific getters, we can use the parent class getters which are inherited by all child classes.

## `super` keyword

- Calls the parent constructor to update the inherited fields
- Used to send constructor parameters from child class to the parent class

Here, the parent class expects 3 arguments for the fields that will be inherited by it's child classes

###### Product.java

```java
private double price;
private String color;
private String brand;

// # Constructor
public Product(double price, String color, String brand) {
  this.price = price;
  this.color = color;
  this.brand = brand;
}
```

But both the child classes need to have all arguments including the child specific fields and the parent class fields

###### Shirt.java

```java
private Size size;

public enum Size {
  SMALL, MEDIUM, LARGE
}

// Constructor
public Shirt(double price, String color, String brand, Size size) {
  this.size = size;
}
```

###### Pants.java

```java
private int waist;
private int length;

// Constructor
public Pants(double price, String color, String brand, int waist, int length) {
  this.waist = waist;
  this.length = length;
}
```

Now when we get all these arguments while creating an object from the class, we need to somehow pass the parent fields to the parent class since the child class only use the child class specific arguments. This is where `super` keyword is used.

```java
super(price, color, brand);
```

We pass all the required arguments while creating the objects

###### Main.java

```java
Shirt shirt = new Shirt(100.0, "Black", "Adidas", Size.SMALL);
Pants pants = new Pants(120.0, "Navy Blue", "Nike", 32, 56);
```

The child class gets the arguments and passes it to the parent class

###### Shirt.java

```java
public Shirt(double price, String color, String brand, Size size) {
  super(price, color, brand);
  this.size = size;
}
```

###### Pants.java

```java
public Pants(double price, String color, String brand, int waist, int length) {
  super(price, color, brand);
  this.waist = waist;
  this.length = length;
}
```

Now the 3 arguments are passed to the `super` constructor which means the constructor of the current class's parent class which is `Product` class in our case.

These 3 fields are updated when the parent constructor is called and the rest of the child specific fields are updated by the respective child class constructors.

> Parent class is also called `super` class
