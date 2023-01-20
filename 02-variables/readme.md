## Variables

Variables are used for storing data.

```java
int apples = 6; // int ->  stores integers
long population = 800000000L; // long ->  stores long integer
double price = 5.99; // double -> stores decimals
String greeting = "Hello"; // String -> stores texts
char grade = 'A'; // char -> stores single characters
```

- Always choose the data type which occupies the least space out of all the suitable ones.
- Name variables using **lowerCamelCase**.
- Any variable value can be updated after it's defined as long as it follows the variable range

```java
public class Bus {
  public static void main(String[] args) {
    int passengers = 0;

    passengers = passengers + 9; // more passengers come on bus stop
    System.out.println(passengers); // 9
  }
}
```

## Variable Types

#### int

- Uses **4 bytes** of memory
- Can store any value in 2 billion range
- Highest value it can store is _2,147,483,647_

```java
int apples = 6;
apples += 4;
System.out.println(apples) // 10
```
