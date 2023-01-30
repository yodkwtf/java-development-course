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
