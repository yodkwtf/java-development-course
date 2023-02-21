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

## Default equals()

- Only checks for references of objects and whether they are equal or not
- Uses `==` operator to compare references

```java
City paris = new City("Paris", 2161000);
City copy = paris;
City differentCopy = new City(paris);

System.out.println(paris.equals(copy)); // `true` since both share references
System.out.println(paris.equals(differentCopy)); // `false` since copy constructor is used hence a new copy and reference of the `paris` object is created
```

- So even if all the values are equal, it'll return `false` if the references are different

#### The issue with ArrayList

- Every time we add an object to the list, a new reference is created

```java
ArrayList<City> cities = new ArrayList<>();
cities.add(new City("Paris", 2161000)); // new reference
cities.add(new City("Florence", 382258));
cities.add(new City("Venice", 261905));
```

- Let's say we check if a certain object is present is in the list or not

```java
 City paris = new City("Paris", 2161000); // new reference
 System.out.println(cities.contains(paris)); // false
```

Now even though the list has an object with the same fields we asked, it still returns false since the references of both the objects are different. This happens because behind the scenes the `contains()` method loops over the list to check uses **default equals** which only checks for references.

Hence, this isn't ideal since our list does contain the asked object.

## Overriding equals()

- Default equals method can be overridden in it's class

```java
@Override
public boolean equals(Object o) {
  if (o == this)
      return true;
  if (!(o instanceof City)) {
      return false;
  }
  City city = (City) o;
  return Objects.equals(name, city.name) && population == city.population;
}

// > Equality Contract: When you override equals, you must override hashcode.
@Override
public int hashCode() {
  return Objects.hash(name, population);
}
```

- DON"T change signature (parameter name) of the equals method otherwise Java won't recognize you're overriding it

- In the parameters, `Object` is the first argument that can be an object of any type (including Lists) and `o` is the second argument which is being compared with the first one

#### Working

- First we check if the references of the objects are same

```java
if (o == this)
  return true;
```

- Now, if the references of the object are not equal, we check if the second object is not an instance of the same class

```java
if (!(o instanceof City)) {
  return false;
}
```

- If it is instance of the same class, then we typecast it first and then compare all the field values of both objects

```java
City city = (City) o;
return Objects.equals(name, city.name) && population == city.population;
```

##### So now if we test the following code -

```java
ArrayList<City> cities = new ArrayList<>();
cities.add(new City("Paris", 2161000)); // new reference
cities.add(new City("Florence", 382258));
cities.add(new City("Venice", 261905));

City paris = new City("Paris", 2161000); // new reference
System.out.println(cities.contains(paris));
```

- `contains()` method will call overridden `equals` method
- First condition will be false since references aren't equal
- Second condition will also pass since `paris` object is an instance of `City` class
- Then we compare the field values `paris` object with the city object at each iteration and return true when all the field values match
- So we finally check if an Object (List in our case) contains another object even if the references are unique
