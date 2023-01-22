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

- Uses **4 bytes (32 bits)** of memory
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

#### char

- Used to store only single characters
- Java only allocates **2 bytes (16 bits)** for char
- No matter what character we store, it only takes 2 bytes in memory
- Char values should be wrapped in **single quotes ('A')**
- `char letter = 'F'` vs `String letter = "F"` can be a diff b/w _2 bytes_ vs _48 bytes_

```java
char mathGrade = 'A';
char scienceGrade = 'C';

System.out.println("Maths - " + mathGrade); // Maths - A
System.out.println("Science - " + scienceGrade); // Science - C
```

#### long

- Used to store large whole numbers
- Takes **8 bytes (64 bits)** of memory
- Use them if you expect the variable to cross 2 billion range (for eg, YouTube views)
- Need to put an **L** at the end of variable value to let Java know it's going to be a long integer

```java
long dailyGoogleSearches = 8000000000L;
long population = 95_000_000_000L; // makes it easier to read

System.out.println("Population is " + population); // Population is 95000000000L
```

> **FAQ**
>
> Ques: If I have specifically declared that a variable is to be of type long, why do I need to state this again with the "L" suffix on the value?
>
> Ans: The data type declaration and the number literal are interpreted separately, so the compiler can't infer the data type when considering the number literal.

#### double

- Used to store decimals
- Takes **8 bytes (64 bits)** of memory
- Can take up to 15 decimal places

```java
double gradePoint = 8.46;

System.out.println("CGPA - " + gradePoint); // CGPA - 8.46
```

> Note!
>
> Always use double instead of int for math calculations. Otherwise, 20/3 which is 6.67 (double) will be turned into 6 (int) and result in falsy calculations.

## Math Operations

Always wrap maths operations in brackets when they are performed within a string.

```java
int a = 5;
int b = 7;

// wrong way
System.out.println("Sum will be " + a + b + " apples"); // ❌ Sum will be 57 apples

// right way
System.out.println("Sum will be " + (a + b) + " apples"); // ✔ Sum will be 12 apples
```

This is done to provide some kind of order for things to happen.

The mathematical operators in Java are -

- \+ (plus)
- \- (minus)
- \* (multiplication)
- / (division)
- % (modulus - returns the remainder)
- ++ (add 1)
- -- (subtract 1)
- += (add by - increase value by number on the right)
- -= (subtract by - decreases value by number on right)

## Type Casting

Variable values can be casted from one type to another. It can be done by using a parenthesis before the variable and putting the required type in that parenthesis.

```java
int a = 20;
int b = 3;

System.out.println(a / b) // 6
System.out.println((double) a / b) // 6.666...
```

## Scanner

Contains methods that can be used to scan for user input.

- `nextInt()` - used to scan Integers
- `nextDouble()` - used to scan Decimals
- `nextLine()` - used to scan Text

Scanner with all of its logic and methods is defined inside _Java.utils_ and therefore we need to import it first.

```java
import java.util.Scanner;

// create a new scanner instance
Scanner scanner = new Scanner(System.in);

// use scanner methods to get user data
System.out.println("What's your name?");
String name = scanner.nextLine();

System.out.println("What's your age?");
int age = scanner.nextInt();

// close the scanner instance
scanner.close()
```

Also, always close the scanner instance when you are done with it to avoid any memory leak.

The first `nextLine()` after `nextInt()` or `nextDouble()` gets skipped and the solution is to put a throwaway or temporary `nextLine()` in between which will be ignored.

> There are a bunch of escape characters that can be used to special things.
>
> **\n** can be used to add a new line or line break whereas **\t** is used for adding a tab space.
