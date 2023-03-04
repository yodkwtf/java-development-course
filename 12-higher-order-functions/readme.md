## Higher Order Functions

- Makes code a lot more
- Need to know your intent before running
- Lambda expressions is used to express that intent
- Takes in a lambda function to specifies what task to perform
- Depend/Rely on different types of functional interface for the lambda functions

#### The Benefit of Higher Order Functions

1. _Conciseness_: provide abstraction over iteration and operations, resulting in more concise and maintainable code

1. _Reusability_: offer reusability with any collection, enabling the creation of a single function that can be utilized throughout the codebase

1. _Expressiveness_: simplify code and enhance its expressiveness by providing functional methods, such as map, that can easily transform data

1. _Function composition_: can be combined to create more complex operations, enabling the creation of larger, more modular code

1. _Declarative programming_: promote declarative programming, allowing developers to specify what should happen without concerning themselves with implementation details

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

###### `ForEach` when invoked from an array relies on a `Consumer`

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

#### BiConsumer

Receives two parameters and produces a side-effect - `(x, y) -> {code}`

###### `ForEach` when invoked from an Map relies on a `BiConsumer`

```java
List<Integer> integers = Arrays.asList(25, 19, 23, 45, 38, 23, 59, 12);

// Sort the list of integers in ascending order
integers.sort((right, left) -> {
  return right.compareTo(left);
});

// Sort the list of integers in descending order
integers.sort((right, left) -> left.compareTo(right));
```

## Stream Operations

- Make code expressive and easier to read
- Most stream operations are higher order functions that do most work behind the scenes
- Chaining these operations makes very complex logic into a couple lines of code

#### Stream Process

- Stream pipelines cannot process entire data source at once
- Data source need to be divided into streams

```java
List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

// break data source into a stream of elements
prices.stream();
```

- Stream pipeline process streams one element at a time

```java
prices.stream()
  .filter(price -> {
    return price > 100;
  })
  .map(price -> {
    return price * 0.9;
  })
  .sorted((price1, price2) -> {
    return price1.compareTo(price2);
  })
  .map(price -> {
    return "$" + price;
  })
  .forEach(price -> {
    System.out.println(price);
  });
```

Here `forEach` is the **terminal operation** since it terminates the pipeline after producing the output.

- Java is smart enough to infer _the return type_ based on the type of lambda expression

###### So our code can be simplified into -

```java
prices.stream()
  .filter(price -> price > 100)
  .map(price -> price * 0.9)
  .sorted((price1, price2) -> price1.compareTo(price2))
  .map(price -> "$" + price)
  .forEach(price -> System.out.println(price));
```
