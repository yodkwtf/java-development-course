## Booleans & Conditionals

A Boolean is only limited to two values - **true or false**. Java only allocates the smallest unit to it which is **1 Bit**.

```java
boolean b1 = true;
boolean b2 = false;

System.out.println(b1); // true
System.out.println(b2); // false
```

They are most useful in the form of comparisons.

> Note: `true` and `false` are always lowercased.

#### Comparisons

There are 8 types of comparison operators.

| Operator |        Comparison         |
| :------: | :-----------------------: |
|    >     |       greater than        |
|    <     |         less than         |
|    >=    | greater than or equal to  |
|    <=    |   less than or equal to   |
|    ==    |         equal to          |
|    !=    |       not equal to        |
|  equals  |   equal to (for String)   |
| !equals  | not equal to (for String) |

`equals` method for String works like

```java
String.equals(String)
```

#### Key Points to Remember

1. Never use `==` or `!=` to compare String values. It produces weird results.
2. Don't confuse `=` and `==`.

   - `=` sets a variable equal to a new value
   - `==` compares 2 values and returns a boolean

## If-Else Statements

- Runs code only if a condition is true
- A comparison within a if statement is called a _condition_

```java
int grade = 65;

if (grade > 50) {
System.out.println("You passed!");
}
```

- When if condition is false, Java runs the _else_ statement

```java
int grade = 65;

if (grade > 80) { // false
   System.out.println("You topped!");
} else {
   System.out.println("You passed but didn't top!");
}
```

> We need to be careful while putting the conditions, i.e., keep `greater than and equal` to in mind too.

#### Nested If-Else Statements

- Between if and else, more if-else statements can be added to test many conditions.
- Java only runs the first statement that ends up being true and ignores the rest.

```java
int grade = 75;

if (grade >= 90) {
   System.out.println("You got an A+ grade!");
} else if (grade >= 80) {
   System.out.println("You got an A grade!");
} else {
   System.out.println("You failed and got an F grade!");
}
```

## Logical Operators

- Can connect many comparisons into one condition.
- Most common ones are **OR** and **AND**.

#### OR (`||`)

- returns true if any one comparison is true

```java
int chemGrade = 65;
int engGrade = 75;

if (chemGrade > 70 || engGrade > 70) { // true
System.out.println("You got a scholarship!!!"); // runs
} else {
System.out.println("Haha noob");
}
```

#### AND (`&&`)

- returns true if any all of the comparisons are true
- if any one of the condition is false, entire comparison becomes false

```java
int credits = 52;
double GPA = 3.45;

if (credits >= 50 && GPA > 3.5) { // false
System.out.println("You got a diploma!!!");
} else {
System.out.println("No diploma"); // runs
}
```
