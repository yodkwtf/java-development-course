## Exception Handling

There are two types of exceptions -

1. **Compile Time**: predictable failure checked before execution
2. **Runtime**: occurs at runtime and isn't checked by compiler

## Compile-Time Exceptions

- Failures that we can predict before executing our code
- Examples are -
  - `FileNotFoundException`
  - `NetworkException`
  - `SQLException`
  - `IOException`

##### Let's say we want to load an external file in our java code

The basic approach would be the following -

```java
import java.io.FileInputStream;

public class Example1 {
  public static void main(String[] args) {
    FileInputStream fis = new FileInputStream("greetings.txt");
  }
}
```

This code will not run since it's possible that the **greetings.txt** file may randomly be deleted any time and hence we won't be able to load it.

Hence we need to use the **try and catch block** to run this code.

```java
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example1 {
  public static void main(String[] args) {
    // try to run the code
    try {
      FileInputStream fis = new FileInputStream("greetings.txt");
    }
    // incase we get a FileNotFound error, get the message from the error
    catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }
}
```

- So instead of crashing, it allows us to fail on our own terms
- Allows us to handle the errors based on how we want

#### `Finally` Block

- runs no matter what
- good place to clean up code

```java
main() {
  try {
    FileInputStream fis = new FileInputStream("greetings.txt");
  }
  catch (FileNotFoundException e) {
    System.out.println(e.getMessage());
  }
  finally {
    System.out.println("Process complete");
  }
}
```

The above **finally** block runs no matter we run the **try** or the **catch** block

## Runtime Exception

- Exceptions not checked by the compiler
- Examples are -
  - `ArrayIndexOutOfBoundsException`
  - `NullPointerException`
  - `InputMismatchException`
  - `IllegalArgumentException`
- These aren't always result of programming errors
- It is developer's responsibility to expect these and write error prone code

#### Examples

###### ArrayIndexOutOfBoundsException

```java
int[] grades = new int[] { 96, 65, 56, 86 };
System.out.println(grades[4]); // element 4 isn't there
```

###### InputMismatchException

```java
String[] names = new String[7];
names[0] = "John";
names[1] = "Jim";
names[2] = "Joe";

for (String name : names) {
  System.out.println(name.toUpperCase()); // calling methods from null after 3 iterations
}
```

###### InputMismatchException

```java
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter a random integer");
scanner.nextInt(); // mismatch when user enters a wrong type like string
scanner.close();
```

## Argument Validation

- Ensures that methods only receive correct arguments

#### Quality Control POV

- Throws `IllegalArgumentException` if a method receives wrong arguments

```java
public void setAge(int age) {
  if(age < 0) {
    throw new IllegalArgumentException("Age cannot be negative");
  }
  this.age = age;
}

public void setUsername(String username) {
  if(username == null || username.isBlank()) {
    throw new IllegalArgumentException("Invalid username");
  }
  this.age = age;
}
```

- Ensure our method only runs if we pass the right arguments, otherwise we crash the program

#### Handling User Input POV

- prevent exceptions from being thrown

The following code will throw an error since the `username` is initially null

```java
user.setUsername(user.getUsername());
```

A correct way could be the following but it'll still crash if user enters a blank value

```java
user.setUsername(scanner.nextLine());
```

Hence, the correct way would be -

```java
String username = scanner.nextLine();

if (username.isBlank()) {
  System.out.println("Sorry, that is an invalid username");
} else {
  user.setUsername(username);
}
```

Similarly, we can validate for **age**

```java
String age = scanner.nextInt();

if (age < 0) {
  System.out.println("Sorry, that is an invalid age");
} else {
  user.setUsername(age);
}
```
