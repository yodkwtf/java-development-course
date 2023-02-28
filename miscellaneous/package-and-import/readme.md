## Package

- `package` keyword specifies the package that a class belongs to

###### If we are in a parent directory where there's another child directory with some classes, those classes need to specify the package they belong to

```java
package model;

public class Game {
  main();
}
```

```java
package model;

public class Team {
  main();
}
```

## Import

- `import` keyword allows you to use classes that exist in other packages
- Needs to be used when using classes from another package

###### For eg, if we want to use some classes from the `/model` directory in the `main` directory, we'd need to import it first

```java
import model.Game;

public class Main {
  main();
}
```

- Built-in packages are also imported from their parent classes

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
  main() {
    Map<String, String> tree =  new HashMap<>();
  }
}
```

## Nested Packages and Imports

Let's say a file called `Test.java` is present in `src/main/java/com/dk` directory and needs to be used in the root directory in the `Main.java`

###### Package

```java
package src.main.java.com.dk;

public class Test {
  public void print() {
    System.out.println("Hello World!");
  }
}
```

###### Import

```java
import src.main.java.com.dk.Test;

public class Main {
  main () {
    Test test = new Test();
    test.print();
  }
}
```

> Some IDEs like VSCode have excellent support for these packages and imports and usually update them on their own whenever there is a change.
