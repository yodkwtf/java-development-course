## Arrays

- Used to store many values at one time in an organized way
- All the values have to be of the same type
- These values are somewhat related to one another

To create an array of integers -

```java
int[] integers = {1, 2, 3};
```

To create an array of strings -

```java
String[] words = {"hi", "hello", "hola"};
```

To create an array of decimals -

```java
double[] words = {1.2, 2.2, 3.3};
```

- Variable does not store the array directly, it store the reference that points to the created array
- Printing a whole array prints its Hashcode representation

```java
String[] names = { "John", "Mary", "Bob" };
System.out.println(names); // [Ljava.lang.String;@5acf9800 (memory address)
```

- Each array element is stored at an index (starting from 0) and can be printed separately

```java
                  // 0       1       2
String[] names = { "John", "Mary", "Bob" };
System.out.println(names[0]); // John
System.out.println(names[1]); // Mary
System.out.println(names[2]); // Bob
System.out.println(names[3]); // Array Index Error
```
