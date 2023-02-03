## Loops

Loops are used to run a block of code multiple number of times. There are 2 types of loops -

- For loops
- While loops

Use a **for loop**:

- when you know how many times a code needs to run.

Use a **while loop**:

- when it's not clear how many times a code needs to run

## For Loops

- Runs code a specific number of times
- A for loop has 3 parts -
  1. Starting point: `int i=1`
  2. Stop condition: `int i<=3`
  3. Step size: `i++`

```java
// for loop with 3 iterations
for (int i = 1; i <= 3; i++) {
  System.out.println(i);
}
```

In the above code,

- **i** starts with value 1 and we run the code inside the loop and print 1
- Then we increment **i** and run the code where `i=2` and print 2
- Then we increment it again and **i** becomes 3 and we repeat the previous step
- When 3 is printed and we increment **i** again and it becomes 4
- Hence the condition `i<=3` becomes false for the next iteration
- We break out of the loop

Final Output -

```sh
1
2
3
```

## While Loops

- Keeps running code **while** something is **true**
- Only thing a while loop needs is a **condition**

```java
int num = 25;

while (num <= 30) {
  System.out.println(num);
  num++;
}
```

In the above code,

- Initially since the condition `num<=30` is true we enter the while loop
- In the first iteration **num** is printed as 25 and then we increment **num** by 1
- It becomes 26 and next iteration prints 26 and increments **num** again
- The loop continues until 30 is printed and **num** becomes 31
- Now the condition `num<=30` becomes false and we break out of the loop

#### Incorrect Code ❌

```java
int num = 25;

while (num <= 30) {
  System.out.println(num);
}
```

In the above code,

- The condition `num <=30` will always be true
- The loop will run forever and will eventually crash the program

> In real world, we should have used a for loop for this example since we know how many times we need to run the code since we know the ending condition, i.e., when num becomes 31.

## `Break` and `Continue`

The `break` and `continue` statements give us more control over our loops.

#### Continue

- Skips an iteration and continues to the next iteration

```java
for (int i = 1; i <= 5; i++) {
  if (i % 2 == 0) {
    continue; // skips the iteration if above condition is true
  }
  System.out.println(i);
}
```

Output -

```sh
1
2
5
```

#### Break

- Breaks the loop and stops all the upcoming iterations

```java
for (int i = 1; i <= 5; i++) {
  if (i % 2 == 0) {
    break; // exits the loop if above condition is true
  }
  System.out.println(i);
}
```

Output -

```sh
1
```

## Nested Loops

- Nested loops are loops inside loops
- Have an **outer loop** and an **inner loop**

```java
for (int i = 1; i <= 3; i++) {
  for (int j = 1; j <= 3; j++) {
    System.out.println("i: " + i + ", j: " + j);
  }
}
```

In the above code,

- Every iteration of outer loop will run the inner loop 3 times (From j=1 to j=3)
- Outer loop itself will also have 3 iterations (From i=1 to i=3)
- Hence the loop will run a total of 3x3 = 9 times and the output will be -

```sh
i: 1, j: 1
i: 1, j: 2
i: 1, j: 3
i: 2, j: 1
i: 2, j: 2
i: 2, j: 3
i: 3, j: 1
i: 3, j: 2
i: 3, j: 3
```

#### Applications of Nested Loops

- Useful when working with 2D arrays
