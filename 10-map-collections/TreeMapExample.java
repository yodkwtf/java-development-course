import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
  public static void main(String[] args) {
    int n = 5;

    // Create a TreeMap object called tree
    Map<Integer, Integer> tree = new TreeMap<>();

    // Add keys and values
    tree.put(1, n * 1);
    tree.put(2, n * 2);
    tree.put(3, n * 3);
    tree.put(4, n * 4);
    tree.put(5, n * 5);
    tree.put(6, n * 6);
    tree.put(7, n * 7);
    tree.put(8, n * 8);
    tree.put(9, n * 9);
    tree.put(10, n * 10);

    // Get values by their keys
    System.out.println("\nWhat is 4 multiplied by " + n);
    System.out.println(tree.get(4)); // 20

    System.out.println("\nWhat is 7 multiplied by " + n);
    System.out.println(tree.get(7)); // 35

    System.out.println("\nWhat is 3 multiplied by " + n);
    System.out.println(tree.get(3)); // 15

    System.out.println("\nDoes the table reach 20?");
    String response = tree.containsKey(20) ? "Yes!" : "No, sorry!";
    System.out.println(response); // No, sorry!
  }
}
