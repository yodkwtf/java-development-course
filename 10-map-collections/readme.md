## Map Collections

**HashMap**: stores unordered collection of key-value pairs

**TreeMap**: stores ordered collection of key-value pairs

- Both share the same type `Map`

> Both objects sharing same type -> **Polymorphism**

- Maps can share any pair of objects like "Strings and Integers", "Integers and Strings", "Strings and Decimals"

- First object in every entry is called **key** and it maps to another object called a **value**

#### Creating Maps

```java
import java.util.HashMap;
import java.util.Map;

public class HashMapInventory {
  public static void main(String[] args) {
    Map<String, Double> inventory = new HashMap<>();
  }
}
```

#### Setting Data

Map collections have a method called `put()` which accepts key value pairs

```java
map.put("Bananas", 3.99);
```

#### Getting Data

Map collections have a method called `get()` which accepts key and returns it's mapped value

```java
map.get("Bananas"); // 3.99
```

#### Checking Data

Maps have a `containsKey()` method which checks whether a key exists in collection or not by returning a boolean value

```java
boolean result = inventory.containsKey("Apples");
```

## HashMap

Let's store price of different items in a Hashmap where each item will be of string type and it's price will be of double type -

```java
// Create a HashMap
Map<String, Double> inventory = new HashMap<>();
```

#### How data gets stored?

```java
// Insert Values
inventory.put("Bananas", 3.99);
inventory.put("Papaya", 5.99);
inventory.put("Kale", 4.99);
inventory.put("Apples", 1.99);
```

1. The moment we add the first entry, an array that stores 16 elements gets created.

```sh
# New array created
```

2. A function processes the key and returns an integer known as a **hash** .

```sh
# Key is processed and a hash value of `14565564` is returned
```

3. Then a bitwise operation on the hash determines the index where the key-value pair will be stores.

```sh
# Bitwise operation converts `14565564` to an index `3`
```

4. The element at that index stores a reference to a node which stores the key-value entry.

```sh
# A new element is created at index `3` which stores reference to a node with key-value `bananas: 3.99`
```

5. The process repeats every time we add a value to the HashMap

6. If we get an index where an element is already store, a collision occurs and this case, the prev node at that index now stores a reference to the new node (imagine LinkedList)

Hence, in HashMaps we have an array where each element of the array refers to a linked list of nodes.

#### How data is retrieved?

```java
// Insert Values
inventory.get("Bananas"); // 3.99
inventory.get("Papaya"); // 5.99
```

1. We provide a key in `get()` method

2. It gets hashed into a numerical value

3. A bitwise operation determines the index in the array using that numerical value

4. We check the linked list at that index and find the node which matches our key

5. Once we find a key, we get it's corresponding value

When there are no collisions, **lookup operations** on HashMaps are very fast.
