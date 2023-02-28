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
