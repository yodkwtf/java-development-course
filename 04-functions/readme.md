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
