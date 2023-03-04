## Higher Order Functions

- Makes code a lot more
- Need to know your intent before running
- Lambda expressions is used to express that intent
- Takes in a lambda function to specifies what task to perform
- Depend/Rely on different types of functional interface for the lambda functions

## Types of Lambda Functions

| Functional Interface | Example                                  |
| -------------------- | ---------------------------------------- |
| Consumer             | `x -> {code}`                            |
| Predicate            | `x -> { return boolean }`                |
| Function             | `x -> { return value }`                  |
| BiConsumer           | `(x, y) -> { code }`                     |
| Comparator           | `(x, y) -> { return int }`               |
| BinaryOperator       | `(x, y) -> { return value (same type) }` |

#### Consumer

Receives a parameter and produces a side-effect - `x -> {code}`

###### `ForEach` relies on a `Consumer`

```java
List<String> facts = Arrays.asList(
    "Marie Curie was the first woman to win a Nobel Prize.",
    "She received the Nobel Prize in Physics in 1903, and the Nobel Prize in Chemistry in 1911.",
    "Curie was a pioneer in the field of radioactivity, and her work led to the development of X-ray technology."
  );
                    //  consumer
facts.forEach(fact -> System.out.println(fact));
```

#### Comparator

Receives two parameters and returns an integer - `(x, y) -> {return int}`

###### `sort` relies on a `Comparator`

```java
List<Integer> integers = Arrays.asList(25, 19, 23, 45, 38, 23, 59, 12);

// Sort the list of integers in ascending order
integers.sort((right, left) -> {
  return right.compareTo(left);
});

// Sort the list of integers in descending order
integers.sort((right, left) -> left.compareTo(right));
```
