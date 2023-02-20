import java.util.ArrayList;
import java.util.List;

public class ArrayListCode {
  public static void main(String[] args) {
    List<String> cities = new ArrayList<>();

    // adding elements
    cities.add("Paris");
    cities.add("Florence");
    cities.add("Venice");
    cities.add("Versailles");
    cities.add("London");
    cities.add("Petra");
    cities.add("Oslo");
    cities.add("Rome");
    cities.add("Madrid");
    cities.add("Tokyo");

    // ArrayList resizes since it's full
    cities.add("Prague");
    cities.add("Dublin");
    cities.add("Athens");
    cities.add("Marseille");
    cities.add("Chicago");

    // more methods
    System.out.println(cities.size()); // 15
    System.out.println(cities.get(5)); // Petra
    System.out.println(cities.get(8)); // Madrid
    cities.set(2, "Naples"); // replaces `Venice` with `Naples`
    cities.remove(5); // removes `Petra`
    System.out.println(cities.get(5)); // Oslo
    System.out.println(cities.get(2)); // Naples

  }
}
