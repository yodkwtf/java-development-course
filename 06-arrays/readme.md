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

## Looping Arrays

Arrays can be looped over so we don't need to perform a single operation for every single element one by one.

#### The `length` property

- Returns the number of elements in an array

```java
String[] names = { "John", "Mary", "Bob" };
System.out.println(names.length); // 3
```

- Used a lot when looping over arrays

```java
String[] names = { "John", "Mary", "Bob" };

for (int i = 0; i < names.length; i++) {
  System.out.println(names[i]);
}
```

#### Tips

- Always use `length` property to count elements, never do it yourself
- Be careful while using the condition, since the last element will always have the index 1 less than the array's length
- In the above case, if we used `i <= names.length` it will throw an error since at one point `names.length` will be 3 and if we enter the loop with `i=3` we won't get any element since last element has the index 2.

## Updating Arrays

- Use the element index and directly update it's value

```java
String[] names = { "John", "Mary", "Bob" };
System.out.println(Arrays.toString(names)); // [John, Mary, Bob]

// Update the value at index 1 and index 2
names[1] = "Alice";
names[2] = "Charlie";
System.out.println(Arrays.toString(names)); // [John, Alice, Charlie]
```

#### `Arrays.toString()`

- Used to convert arrays into string format

```java
import java.util.Arrays;

String[] names = { "John", "Mary", "Bob" };

System.out.println(names); // [Ljava.lang.String;@5acf9800 (memory address)
System.out.println(Arrays.toString(names)); // [John,  Mary, Bob]
```

#### Adding New Elements

- You cannot change the size of the array once it's created
- If more new elements are need to be added then create a new array with larger size and copy the previous elements into it using a loop
- Manually add the new elements into remaining index of the new array

```java
String[] names = { "John", "Mary", "Bob" };

// Create a new array with a larger size
String[] newNames = new String[5];

// Copy the elements from the old array to the new array
for (int i = 0; i < names.length; i++) {
  newNames[i] = names[i];
}

// Update the value at index 3 and index 4
newNames[3] = "David";
newNames[4] = "Eve";
```

## Reference Trap

- Variables don't store arrays, they store the reference that points to the created array in memory
- We can have more variables that store a reference which points to the same array, for example -

```java
int[] nums1 = {1, 2, 3};
int[] nums2 = nums1;
```

This is a bad practice because it allows us to manipulate `nums1` through `nums2`.

```java
nums2[1] = 5;
```

It will change the value of the second element for both the nums array even though we only did it for one of them. This happens since both of them are pointing to the same array in memory.

Hence, **do not set array variables equal to one another**.

> The state of a variable should not change because you updated another.

#### What to do when we want 2 variables to have the same array?

Create a new array for the second one and copy every value from the first into the new array using a for loop.

**Note**: _This can also be done using the `Array.copyOf(arrayToCopyFrom, lengthToCopy)` method._

Otherwise, if we set array variables equal to one another, they'll point to the same array in memory and mutating one would mutate both (PITFALL).

## 2-D Arrays

- 2D array is an array that contains arrays
- Used when data comes in a form of table or a grid
- Usually needed when we want to create multiple arrays for the same type of items

```java
// Let's say we want to store marks of 3 students of 3 subjects.
int[] student1 = { 90, 80, 70 };
int[] student2 = { 80, 70, 60 };
int[] student3 = { 70, 60, 50 };

// Store marks in 2D array.
int[][] marks = {
  { 90, 80, 70 },
  { 80, 70, 60 },
  { 70, 60, 50 }
};

// Accessing elements using row and column numbers.
System.out.println(Arrays.toString(marks[0])); // [90, 80, 70]
System.out.println(marks[0][1]); // 80

// Updating 2D Array
marks[0][1] = 85;
System.out.println(marks[0][1]); // 85
```
