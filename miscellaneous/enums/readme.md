## Enums

- Use **enums** when a variable is limited to a fixed set of values

In this example, the trafficLight can be only among the 3 values - _RED_, _GREEN_, and _YELLOW_.

###### Example

```java
public void drive(String trafficLight) {
  if (!trafficLight.equals("RED") && !trafficLight.equals("GREEN") && !trafficLight.equals("YELLOW")) {
      throw new IllegalArgumentException("TRAFFIC LIGHT CAN ONLY BE RED, GREEN, YELLOW");
  }

  System.out.println(trafficLight);
}
```

- Makes code easier to read and understand
- Catch errors at compile-time rather than run-time

- Enums are static by default
- The constants inside it are final

#### Creating an Enum

- Can be created using the `enum` keyword
- Use _CamelCase_ to name the enum
- Values are written inside curly braces `{}` using uppercase and underscore format

```java
public enum TrafficLight {
  RED,
  GREEN,
  YELLOW
};
```

#### Using an Enum

- We can restrict our parameters to be one of the values present in the created enums

```java
                //    enum       parameter
public void drive(TrafficLight trafficLight) {
  if (trafficLight == null) {
    throw new IllegalArgumentException("Traffic Light cannot be null");
  }

  System.out.println(trafficLight);
}
```

Since the parameters are already restricted to one of the 3 values, we don't need `IllegalArgumentsException` here. We should still have a `null` check since it can always be passed.

#### Accessing the Enums

- Can be accessed directly from the class

```java
import static model.Car.TrafficLight;

public class Main {
  public static void main(String[] args) {
    Car car = new Car("Nissan", 2020);
    // car.drive(Car.TrafficLight.RED);
    car.drive(TrafficLight.RED);
  }
}
```

Here the `TrafficLight` enum will only let us choose 3 possible values - _GREEN_, _RED_, or _YELLOW_.
