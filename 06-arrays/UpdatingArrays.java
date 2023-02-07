import java.util.Arrays;

public class UpdatingArrays {
  public static void main(String[] args) {
    String[] names = { "John", "Mary", "Bob" };
    System.out.println(Arrays.toString(names)); // [John, Mary, Bob]

    // Update the value at index 1 and index 2
    names[1] = "Alice";
    names[2] = "Charlie";
    System.out.println(Arrays.toString(names)); // [John, Alice, Charlie]

    // # ADDING MORE ELEMENTS
    // Create a new array with a larger size
    String[] newNames = new String[5];

    // Copy the elements from the old array to the new array
    for (int i = 0; i < names.length; i++) {
      newNames[i] = names[i];
    }
    System.out.println(Arrays.toString(newNames)); // [John, Alice, Charlie, null, null]

    // Update the value at index 3 and index 4
    newNames[3] = "David";
    newNames[4] = "Eve";
    System.out.println(Arrays.toString(newNames)); // [John, Alice, Charlie, David, Eve]
  }
}
