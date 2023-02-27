## Map Collections

**HashMap**: stores unordered collection of key-value pairs

**TreeMap**: stores ordered collection of key-value pairs

- Both share the same type `Map`

> Both objects sharing same type -> **Polymorphism**

- Maps can share any pair of objects like "Strings and Integers", "Integers and Strings", "Strings and Decimals"

- First object in every entry is called **key** and it maps to another object called a **value**

#### Creating Maps

```java
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapInventory {
  public static void main(String[] args) {
    // HashMap
    Map<String, Double> inventory = new HashMap<>();

    // TreeMap
    Map<Integer, Integer> tree = new TreeMap<>();
  }
}
```

#### Adding Entries

Map collections have a method called `put()` which accepts key value pairs

```java
map.put("Bananas", 3.99);
```

#### Getting Entries

Map collections have a method called `get()` which accepts key and returns it's mapped value

```java
map.get("Bananas"); // 3.99
```

#### Checking Entries

Maps have a `containsKey()` method which checks whether a key exists in collection or not by returning a boolean value

```java
boolean result = inventory.containsKey("Apples");
```

## HashMap

Stores unordered collection of entries

###### Let's store price of different items in a Hashmap where each item will be of string type and it's price will be of double type -

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

## TreeMap

Stores ordered collection of entries

###### Let's create a multiplication table using TreeMap for `5` where key is the multiplier (integer) and value is the multiple (integer) -

```java
// Create a TreeMap
Map<Integer, Integer> tree = new TreeMap<>();
```

#### Adding Entries

```java
int n = 5;

tree.put(1, n * 1); // 1: 5
tree.put(2, n * 2); // 2: 10
tree.put(3, n * 3); // 3: 15
tree.put(4, n * 4); // 4: 20
tree.put(5, n * 5); // 5: 25
tree.put(6, n * 6); // 5: 30
tree.put(7, n * 7); // 5: 35
```

- When we add entries to a TreeMap, it stores them in a tree like data structure
- It uses _the red black tree algorithm_ to continuously sort entries as they are being added
- It basically stores the entries in ascending order of the keys
- As a result, every node in the left sub-tree is going to be smaller than it's root sub-node and every node in the right sub-tree is going to be higher than the root sub-node

```sh
/**
 *         20
 *       /   \
 *     10     30
 *   /   \    / \
 *  5    15  25  35
 */
```

If we go from left to right, we see tree maps are sorted in ascending order.

#### Accessing Entries

```java
System.out.println(tree.get(4)); // 20
System.out.println(tree.get(7)); // 35
```

- Whenever we get a key we go to the main root node and check whether given key is lower or higher
- If it's lower, we go to the left child nodes else if it's higher we go right
- We keep repeating the step until we find the key we're looking for
- The deeper our node is, the more steps and time it will take to retrieve it

Hence, we see that **TreeMaps** sort entries in ascending key order and the time taken to retrieve data depends on the tree depth.

> Use **HashMap** if order doesn't matter and **TreeMap** if entries need to be sorted
