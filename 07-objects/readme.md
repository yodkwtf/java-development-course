## Objects

- Make code easy to read and understand
- Help us divide our code in modules
- Make it easy to organize code

#### How to identify objects?

- Something that contains fields, for eg, a car object will have fields such as _make_, _price_, _color_, etc.
- Something that can perform tasks, for eg, a car object will perform _the task of driving_

#### Object Oriented Programming

- Organizing your code around objects to write high-quality code.

## Class

- Class is a blueprint from which objects are created
- Defines all the properties or fields the objects need to have

```java
// Car.java

public class Car {
  String make;
  double price;
  int year;
  String color;
}
```

#### Creating Objects from Class

Now from the **Car class** we can create many **Car objects**

```java
Car toyota = new Car(); // variable `toyota` stores the reference to the created object in memory
```

Once an object is created, we can modify it's fields

```java
toyota.make = "Toyota"
toyota.price = 10000
toyota.year = 2020
toyota.color = "Green"
```

Unless we provide some field values, they are considered as null.

## Constructor

- First thing that runs when you create an object
- Allows us create and update object properties in a single line
- The fields should be updated inside the constructor only

#### Creating a Constructor

- Specify a lever of access (public)
- The name of the class
- Parameters or the fields that constructor is going to update

```java
public Car(String make, double price, int year, String color) {
  // properties
}
```

- When calling a constructor we need to pass the values for the fields/constructor parameters

```java
Car nissan = new Car("Nissan", 10000, 2020, "Green");
Car toyota = new Car("Toyota", 20000, 2021, "Red");
```

#### `this` keyword

- Refers to the current object
- Used to distinguish between parameters and the fields that are updated
- `this` can be used to update the fields using the passed values for Constructor parameters

```java
public Car(String make, double price, int year, String color) {
  // updating fields for that object for which `this` is used
  this.make = make;
  this.price = price;
  this.year = year;
  this.color = color;
}
```

When the constructor is done updating the field values using the values passed for the constructor parameters, our object is fully initialized (created) and the variable used stores the reference to this created object.

## Getters

- A public method used to get the value of some field of a class
- It's return type is always the type of the field whose value it returns
- The method name always starts with **get** followed by field name

```java
public String getMake() {
  return make;
}
```

#### Why Getters?

- If we don't make the class fields **private**, they can be accidentally updated later

```java
Car nissan = new Car("Nissan", 10000, 2020, "Green");

// accidentally update
nissan.make = "Toyota";
```

- It's considered a bad practice and hence we should always make the class fields **private** to that class only

```java
public class Car {
  // private fields
  private String make;
  private double price;
  private int year;

  public Car(String make, double price, int year,) {
    this.make = make;
    this.price = price;
    this.year = year;
  }
}
```

- This makes the fields private but it means we can't access them even while printing

This is where **Getters** come in. They are methods which are used to get the value of certain fields.

```java
public String getMake() {
  return make;
  // We don't need `this` keyword since there is no conflicting variable of the same name unlike we had in the constructor function
}
```

- Always use getters to access object fields

## Setters

- Public methods used to update the private fields of a class
- Takes a parameter whose type depends on the field it's going to update
- Name always starts with **set** followed by the field name it updates

```java
public void setMake(String make) {
  this.make = make;
}
```

#### Why Setters?

- Since fields are made private using the **private** keyword and hence they can not be directly updated using the objects

The following code won't work since the fields are not visible to _toyota_ object -

```java
Car toyota = new Car("Toyota", 20000, 2021, "Red");

toyota.make = "Toyota"; // won't work
toyota.price = 20000; // won't work
```

That's where **Setters** come in. These methods are used to update the value of certain fields.

```java
public void setMake(String make) {
  this.make = make;
  // We need `this` keyword since there is a conflicting variable of the same
}
```

Now even though we have private fields in our class, we have public Getters to get the field values and public setters to update the field values.

> There's a nifty VSCode Extension called **Java Code Generators** that can generate getters and setters for any class with just one command.
