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

## Copy Constructor

- Copy Constructor is used to create an exact copy of an object with the same values of an existing object.

Let's say we need to create an object which has to be the same as another created object. We can't make the 2 objects equal to each other otherwise we'd run into reference trap. For example,

```java
Car nissan = new Car("Nissan", 10000, 2020, "Green");
Car nissan2 = nissan; // ❌ wrong practice

// Since both `nissan` and `nissan2` point to the same object in the memory, updating any one would update both of them
nissan2.setColor("Yellow");
nissan.getColor(); // Yellow
nissan2.getColor(); // Yellow

nissan.setColor("Orange");
nissan.getColor(); // Orange
nissan2.getColor(); // Orange
```

When we're in a situation like this, a **copy constructor** can be used.

- Used to create an object with the properties of another object

```java
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
```

- While creating the new object we should use the copy constructor instead so that both objects don't share the same reference

```java
Car nissan = new Car("Nissan", 10000, 2020, "Green"); // using Constructor
Car nissan2 = new Car(nissan); // using Copy Constructor
```

- Now the variable `nissan2` will store a unique reference

```java
nissan2.setColor("Yellow");
nissan.getColor(); // Green
nissan2.getColor(); // Yellow

nissan.setColor("Orange");
nissan.getColor(); // Orange
nissan2.getColor(); // Yellow
```

#### Mutable Objects

- Objects which can be mutated using setters after they are created
- Dealing with these objects, avoid setting them equal to one another

#### When to use Copy Constructors?

There are 2 good reasons for using a copy constructor instead of the constructor passing all parameters:

1. When you have a complex object with many attributes it is much simpler to use the copy constructor instead of creating the same/similar object again and again with so many attributes and values.

2. If you need to add a few new attributes to your objects along with older ones, you just change the copy constructor to take these new attribute into account along with older ones

## Arrays are Mutable Objects

Arrays are mutable objects that means they can be updated even after they are created. Therefore, it's very important to use them carefully. For example,

```java
private String make;
private double price;
private String[] parts;

// Constructor
public Car(String make, double price, String[] parts) {
  this.make = make;
  this.price = price;
  this.parts = parts;
}
```

This would be considered a bad practice since we are making one array variable equal to the other

```java
this.parts = parts; // we are just storing the reference of the `parts` array to `this.parts`
```

In this case, if we update any one of the 2 values later, both of them would be updated since they both point to the same reference in memory.

Let's say the parts array that was passed to the constructor was initially -

```java
String[] spareParts = new String[] {"Tires", "Keys"};
```

and then we changed an element -

```java
spareParts[0] = "Filter";
```

Since, spareParts, **parts** and **this.parts** all store the reference to the same array, all of them would be updated which isn't ideal at all.

#### Fixing the Constructor

It can be fixed by using a copy of the passed array as it creates a new reference (object) in the memory

```java
this.parts = Arrays.copyOf(parts, parts.length); // copy full length of the array
```

Now even if we mutate the array passed to the constructor (spareParts), the car objects won't be mutated since they all store a unique reference for the parts field

#### Fixing the Copy Constructor

If we don't fix the copy constructor, any object created with it will share the reference (for the _parts_ field) of the object that is passed as the **source**.

Then if we update the source object's or the newly created object's _parts_ field, both of them would be updated since they both point to the same object in memory.

```java
public Car(Car source) {
  this.make = source.make;
  this.price = source.price;
  this.year = source.year;
  this.color = source.color;
  this.parts = Arrays.copyOf(source.parts, source.parts.length); // FIX: copyOf creates a new reference in memory
}
```

#### Fixing the Getter

If we return the **parts** array directly from the getter than whatever variable is used will store the reference of it and hence will be able to mutate the **parts** array directly.

For example, if the getter is -

```java
public String[] getParts() {
  return this.parts;
}
```

And it is used as -

```java
String[] carParts = nissan.getParts();
carParts[0] = "Filters"; // will mutate `carParts` as well as `nissan.parts`
```

Here, **carParts** and **Nissan.parts** point to the same reference. Hence, mutating one would mutate both of them which is BAD PRACTICE.

This **can be fixed by returning a copy of the array from the getter** function so that a new reference would be returned.

```java
public String[] getParts() {
  return Arrays.copyOf(this.parts, this.parts.length);
}
```

Now whatever variable is used to store the return value of getter function, it will hold a new reference of the array.

#### Fixing the Setter

For the setters, the situation is the same as we had for the constructor. We can't directly set constructor's **parts** array equal to the one that's passed, otherwise if the passed array is later changed, it will also mutate all the instances of the constructor since the passed array and the instances will both be sharing the reference to the same array in memory.

Bug -

```java
public void setParts(String[] parts) {
  this.parts = parts;
}
```

Fix -

```java
public void setParts(String[] parts) {
  this.parts = Arrays.copyOf(parts, parts.length);
}
```

This will make the parts field store a unique reference of the passed array every time the setter function is used.

## toString Method

If we print an object directly, we get the class it's created from along with the reference.

```java
Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);
System.out.println(nissan); // Car@36baf30c
```

This happens because whenever we print the class, behind the scenes a `toString()` method is executed and it returns a string representation of the object.

```java
public String toString() {
  return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
```

We can override this `toString()` method in our class to print a more meaningful result as per our needs.

```java
public String toString() {
  return "Make: " + this.make + "\n"
    + "Price: " + this.price + "\n"
    + "Year: " + this.year + "\n"
    + "Color: " + this.color + "\n"
    + "Parts: " + Arrays.toString(this.parts) + "\n";
}
```

Now when we try to print an object -

```java
Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);
System.out.println(nissan);
// Make: Nissan Altima
// Price: 11000.0
// Year: 2020
// Color: Green
// Parts: [Tires, Keys]
```

## Immutable Objects

Data types in java can be categorized into 3 types -

1. Primitive
2. Immutable Objects
3. Mutable Objects

#### Primitive Data Types

- Most basic data type in Java
- Variables store a single value

```java
int apples = 6; // 4 bytes of memory
long population = 6000000000000L; // 8 bytes of memory
double price = 5.99; // 8 bytes of memory
char = 'A'; // 2 bytes of memory
boolean bool = true; // 1 bit of memory
```

#### Immutable Objects

- For every primitive data type, there is an immutable object type
- We can create new objects of any primitive type using that type's class
- Variables used will only store reference to that object
- Works in the following way -

```java
Integer apples = new Integer(5);
```

- Above method is now depreciated so we can do it directly

```java
Integer apples = 5; // 16 bytes
Long population = 6000000000000L; // 24 bytes
Double price = 5.99; // 24 bytes of memory
Char = 'A'; // 16 bytes
Boolean bool = true; // 16 bytes
```

#### Immutable Objects vs Primitive

1. Immutable objects take more memory than primitive types

   - Include object metadata along with the field value itself

2. Immutable objects can be null, primitive can't be null

   - `null` is a reference that points to nothing when there is no object

   ```java
   Integer apples = null;
   apples = 5;
   ```

   - Primitive types don't play with reference so they can't ever hold `null` since they won't ever eventually point to any object

3. Immutable objects can call methods, primitive objects can not

Hence, only use immutable objects if you have to otherwise always prefer primitive.

#### Immutable Objects vs Mutable Objects

1. Immutable Objects are **safer** since they cannot be modified after creation

   - State of an immutable object can't be changed
   - References can be shared safely across your application

   - You cannot update an immutable object. You can only set the variable equal to a brand new immutable object.
   - Once an immutable object is updated, a brand new reference is created

   ```java
   Integer apples = 5; // apples = Integer@10
   Integer apples2 = apples; // apples2 = Integer@10
   apples2 = 10; // apples2 = Integer@18
   ```

2. Mutable Objects are **less safe** since they can be modified
   - Avoid setting 2 variables equal to one another
   - Sharing references can lead to unintended side effects
   ```java
   City city = new City("Paris"); // city = Object@10
   City city2 = city; // city2 = Integer@10
   city2.setName("Shimla") = 10; // city2 = Integer@10, city = Integer@10
   // `City` also becomes Shimla
   ```

#### String is an Immutable Object

```java
String text = "hi";
String text2 = new String("Hello");
```

Here we are basically setting our variable equal to a new object of the String class.
