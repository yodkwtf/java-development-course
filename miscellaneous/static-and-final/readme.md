## Static Keyword

- An instance field belongs to objects of the class
- A **static** field belongs to the class

###### User.java

```java
public class User {
  // instance fields
  private String firstName;
  private String lastName;

  // static field
  private static int userCount = 0;

  public User(String fName, String lName) {
    userCount++;
    this.firstName = fName;
    this.lastName = lName;
  }

  // instance methods
  public String getFirstName() {
    return this.firstName;
  }
  public String getLastName() {
    return this.lastName;
  }

  // static method
  public static int getUserCount() {
    return userCount;
  }
}
```

###### Main.java

```java
public class Main {
  public static void main(String[] args) {
    User liam = new User("Liam", "Smith"); // userCount = 1
    User olivia = new User("Olivia", "Davis"); // userCount = 2
    User ethan = new User("Ethan", "Martins"); // userCount = 3
  }
}
```

#### Printing Instance Field

```java
User liam = new User("Liam", "Smith");
System.out.println(liam.getFirstName()); // Liam
```

#### Printing Static Field

```java
// Need to use class since it belongs to class
System.out.println(User.getUserCount); // 1
```

> **Static** keyword means belonging to a class

## Static Final CONSTANT

- A **constant** is a field which is same across all objects
- The **final** keyword ensures it cannot be assigned a new value
- A constant field is **static** because it belongs to the class

###### For example, a minimum working age requirement

```java
static final int MIN_AGE = 18;
```

- If we try to assign it a new value, Java will throw errors
- Declared with _UPPERCASE_AND_UNDERSCORES_

> General Rule: Favor constants over loose values

- Incase a value is updated, instead of updating it at 10 different places (_loose values_), it's easy to update it at a single place (_constants_)
- Reduce the chances of bugs
- Constants increase readability of code

###### Some more examples

```java
static final int MAX_AGE = 60; // 4 bytes
static final double TAX = 0.13; // 8 bytes
static final int MAX_RETRY = 10; // 4 bytes
```

#### Accessing Constants

- Since they are **static** and belong to classes, there they can be accessed directly

###### Employee.java

```java
// static final CONSTANT
public static final int MAX_AGE = 65;
public static final int MIN_AGE = 18;

// instance method using `static final CONSTANT`
public void setAge(int age) {
  if (age < MIN_AGE || age > MAX_AGE)
    throw new IllegalArgumentException("INVALID AGE");
  this.age = age;
}
```

- Since they belong to the class, they can only be called by class itself in `main` files

###### Main.java

```java
Employee john = new Employee("John", 45);
Employee lisa = new Employee("Lisa", 20);

System.out.println("Retirement Age: " + Employee.MAX_AGE);
System.out.println("Minimum Working Age: " + Employee.MIN_AGE);
```
