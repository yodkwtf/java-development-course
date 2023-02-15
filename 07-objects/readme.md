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
