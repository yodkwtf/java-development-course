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
