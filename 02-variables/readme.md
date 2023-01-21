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

#### String

- Used to store text
- Unlike _int_ varies in memory
- Empty text takes _24 bytes_ and the more text we add more memory it takes
- Create string value using **double quotes ("some text")**
- Two strings or integers can be concatenated using the **+** operator

```java
String name = "Deekayy";
int amount = 4;
String item = "bats"
String statement = name + " has " + amount + " " + item
System.out.println(statement) // Deekayy has 4 bats
```

#### Char

- Used to store only single characters
- Java only allocates **2 bytes** for char
- No matter what character we store, it only takes 2 bytes in memory
- Char values should be wrapped in **single quotes ('A')**
- `char letter = 'F'` vs `String letter = "F"` can be a diff b/w _2 bytes_ vs _48 bytes_

```java
char mathGrade = 'A';
char scienceGrade = 'C';

System.out.println("Maths - " + mathGrade); // Maths - A
System.out.println("Science - " + scienceGrade); // Science - C
```
