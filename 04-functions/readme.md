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
