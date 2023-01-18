## Java Fundamentals

- Java file names should be CamelCase format
- They should end with **`.java`** extension
- All of the code in java is written inside a class
- Every line of code needs a semicolon
- Java is case sensitive

#### Class

- Every class should have the `class` keyword and a class name like `HelloWorld`
- Class name should always match the filename it's in

```java
class HelloWorld {
  // all the code
}
```

- Classes need a `main` method which acts as an entry point to the class

```java
public class HelloWorld {
  public static void main(String[] args) {
    // code
  }
}
```

#### Print Statement

- `println(msg)` method is used to print msgs to console

```java
System.out.println("Hello World");
```

#### Running the Code

Once we run the code, Java looks for the entry point which is the main function. Once it finds the entry point, it starts executing whatever code is inside it.

If there are any errors Java won't run the code and throw an error displaying the problem and the line.

## Terminal Commands

1. **javac** (Java Compiler) - compiles our code into byte code

   ```sh
   javac <FileName>.java
   ```

   It will compile all the code into _Bytecode_ which will live inside _.class_ file - `HelloWorld.class`

2. **java** executes the compiled code
   ```sh
   java <FileName>
   ```

Always recompile code after making any changes.

## Comments

Comments are written using **double slashes (`//`)**. These lines are completely ignored while compiling the code.

```java
public class Comments {
  public static void main(String[] args) {
    // this line will be ignored
    System.out.println("Hello World");
  }
}

-> Hello World
```
