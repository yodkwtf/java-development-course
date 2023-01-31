## Functions

A **Function** is a group of code that performs a particular task. Functions make your code more organized and reusable.

There are 5 components for every function -

1. Level of access
2. Return value
3. Function name
4. Parameters
5. Code inside functions

```java
// 1     2    3      4
public void name (int param) {
  // code -> 5
}
```

- Function can be called as many times as needed using syntax `functionName()`
- Function names should be _lowerCamelCase_
- Functions are also called methods at times

## Parameters

- Stores a value that functions expect to receive
- Function with parameters expect values to be passed to function during function call
- For every parameter we need to pass one value to the function

#### Arguments

- Values that we pass into function
- These are the actual values that will be used inside function

```java
// len & bth -> parameters
public static void calculateArea(double len, double bth) {
  System.out.println("Area: " + len * bth);
}

// 10 & 20 or 9.3 & 21 -> arguments
public static void main(String[] args) {
  calculateArea(10, 20); // 200.0
  calculateArea(9.3, 21); // 195.3
}
```

## Return Statements

- Functions can return a value at the end
- Return type must be specified at the time of function declaration
- Return type are means what type value will be returned from the function

```java
// - <return_type> -
public double calcArea(double len, double bth) {
  double area = len * bth;
  return area; // <return value>
}
```

- Function call stores the returned value and later it can be stored inside a variable

```java
double curArea = calcArea(10.0, 5.0);
System.out.println(curArea) // 50.0
```

- Return statement stops the function execution then and there and no further lines of code are run inside that function

**_Every function should always perform only one task!_**

- If a function is only printing something and doesn't perform any computation, it doesn't need to return anything and should have the **void** return type

- If a function is performing any computation/calculation that it should just return the calculated value and let the parent function decide what to do with the returned value

## Doc Comments

- Can be used to describe what a function does to guide your code
- Key components:
  - What function does
  - Parameters and their types
  - What it returns
- Makes it easy for other collaborators to understand what our code does

```java
/**
 * Function name: printText
 *
 * @param name (String)
 * @param age  (int)
 * @return msg (String)
 *
 * Inside the function:
 *  1. Build the message: "Hi, my name is <name> and I am <age> years old."
 *  2. return the message
 */

public static String printText(String name, int age) {
  String msg = "Hi, my name is " + name + " and I am " + age + " years old.";
  return msg;
}
```

## Scope

Scope refers where the variable can be accessed from. They are either class scoped or function scoped.

#### Function Scope

A variable inside a function can only run inside the function scope. It does not exist outside the function it is declared in.

```java
public static void main(String[] args) {
  System.out.println(apples); // Throws error
  someFunction();
}

public static void someFunction() {
  int apples = 5;
  System.out.println(apples); // Prints `5`
}
```

In the above code,

- Since `apples` variable is declared inside `someFunction`, it can be accessed (or printed) in the main function. We'll get an error.
- Similarly, if the variable had been declared in the `main` function, we wouldn't have been able to use it in `someFunction`.

#### Class Scope

A variable in a class exists in class scope. Scope of a class spans the entire code inside the class. Basically any variable declared in the class scope is accessible in anywhere inside the class.

```java
public class Scope {
  static int dogs = 5;

  public static void main(String[] args) {
    System.out.println(dogs); // Prints `5`
    someFunction();
  }

  public static void someFunction() {
    System.out.println(dogs); // Prints `5`
  }
}
```

## Built-In Functions

- Functions that are already made for us
- `println(arg)` is a built-in void function that just prints the argument we pass and doesn't return anything

Basically, behind the scenes somewhere in Java there is a code like

```java
public void println(String x) {
  // many lines of code
}
```

- `println()` function isn't local to our class, it's attached to some other class and hence we need to use `System.out` before using it

#### Math Functions

There are several built-in maths functions already made in Java for us to use like `log`, `sin` or `cos`.

- Usually math functions expect a _double_ parameter and return a _double_ value.
- Some math functions expect more than 1 parameter. For eg, `Math.pow(2,4)` to calculate powers.
- There are 1000s of such functions and there is no need to memorize them all. **Use Google**.

```java
public static void main(String[] args) {
  double sine = Math.sin(1.2);
  System.out.println("sine: " + sine); // 0.9320390859672264

  double power = calcPower(2, 4);
  System.out.println("power: " + power); // 16.0
}

public static double calcPower(double base, double exponent) {
  return Math.pow(base, exponent);
}
```
