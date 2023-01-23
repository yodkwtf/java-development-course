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

##### Key Points to Remember

1. Never use `==` or `!=` to compare String values. It produces weird results.
2. Don't confuse `=` and `==`.

   - `=` sets a variable equal to a new value
   - `==` compares 2 values and returns a boolean
