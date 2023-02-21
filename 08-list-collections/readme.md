## List Collections

- Used for storing collections of data
- Normal arrays have a fixed size and when we want to add more elements, we'd need to create a new array of bigger size
- Lists like **ArrayList** and **LinkedList** can be used to solve this problem

#### ArrayList & LinkedList

- Do not have a fixed size
- Store data differently
- **ArrayList** is generally preferred over **LinkedList**
- Both are of type `List`

#### Creating Lists

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

List list = new ArrayList();
List list2 = new LinkedList();
```

> When two objects can share the same type, we call this **polymorphism**.

- Type of element a list can store is called **generic**
- Can be overridden by using pointy brackets (`<>`)

```java
List<String> list = new ArrayList<>();
```

This tells Java that we want our list to store elements of type String.

#### Adding Elements to Lists

- All list collections have an `add()` method to add elements

```java
List<String> cities = new ArrayList<>();
cities.add("Paris");
```

#### Removing Elements from Lists

- All list collections have a `remove()` method to remove elements

```java
List<String> cities = new ArrayList<>();
cities.add("Paris");
cities.add("Florence");

cities.remove("Paris"); // removes `Paris`
```

#### More List Methods

- `get()` - Used to get an element by index

```java
cities.get(5);
```

- `set()` - Used to set/replace an element using index and new element

```java
cities.set(3, "Jaipur");
```

- `size()` - To get the size of the list

```java
cities.size();
```

## ArrayList

- Every time we add an element to an ArrayList Java checks whether list **size** is equal to the **capacity**
- Initially both of them are 0, so when we add an element Java sets the underlying field equal to a new array that has the capacity to store 10 elements
- Now if we have added 1 element to the list, **capacity is 10** but the **size is 1**
- When list **size** is finally equal to **capacity** and we add another element, the array list is smart enough to dynamically resize by setting its field equal to a new array of a larger capacity

Thus, when we are using ArrayLists, we can add as many elements as we want since it's smart enough to resize.

```java
main() {
  List<String> cities = new ArrayList<>();
}
```

## LinkedList

- Just like ArrayList, they don't have a fixed size
- Stores data very differently than ArrayList

```java
import java.util.LinkedList;
import java.util.List;

main() {
  List<String> cities = new LinkedList<>();
}
```

- Adding an element to a LinkedList creates a new node that stores the element
- When first node is created, it contains a reference that uniquely identifies it
- When we add more elements to the list, more new nodes are created which not only store the added element but also store the reference to their previous node
- In turn, the previous node stores a reference to the new node

The more elements we add the more new nodes are created such that each nodes store the added element and the reference to their previous and next node.

#### Why retrieving elements from a LinkedList is slow?

Retrieving data from a LinkedList is very slow compared to ArrayLists

- ArrayLists are backed by normal arrays so if we want to access something, it can be grabbed via that index
- LinkedLists don't have any index, they only have a chain of nodes
- So if we want to access any element, the list needs to traverse from the first or the last node (based on which is closer) all the way to the required node one by one.

Hence, it is comparatively slow.

## ArrayList vs LinkedList

- ArrayList is backed by a regular array that increases its capacity based on array size
- LinkedList comprises of node where each node is linked to the prev and the next node

#### Which one is more efficient?

- **ArrayList**: retrieving elements
- **No Difference**: Performing operations from either end of the list
- **LinkedList**: add/removing elements from the middle

While inserting an element in the middle, the ArrayList has to create a new array and copy over the elements of the prev array while inserting the new element inside. It can't just insert a new element in the middle.

The same thing happens while removing an element from the middle.

##### Here's a small example of different operations and their recorded time -

```sh
# FETCHING DATA
LinkedList: 43ms
ArrayList: 0ms

# FIRST / LAST INDEX
LinkedList: 0ms
ArrayList: 0ms

# INSERTION FROM MIDDLE
LinkedList: 0ms
ArrayList: 12ms

# INSERTION
LinkedList: 0ms
ArrayList: 0ms

# REMOVAL
LinkedList: 0ms
ArrayList: 14ms

# UPDATES
LinkedList: 56ms
ArrayList: 0ms
```
