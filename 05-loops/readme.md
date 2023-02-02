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
