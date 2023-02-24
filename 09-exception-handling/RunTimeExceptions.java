import java.util.Scanner;

public class RunTimeExceptions {
  public static void main(String[] args) {

    // # **************ArrayIndexOutOfBounds**************//
    int[] grades = new int[] { 96, 65, 56, 86 };
    System.out.println(grades[4]); // element 4 isn't there

    // - FIX (get data from correct index)
    // System.out.println(grades[3]);

    // # **************NullPointerException**************//
    String[] names = new String[7];
    names[0] = "John";
    names[1] = "Jim";
    names[2] = "Joe";

    for (String name : names) {
      System.out.println(name.toUpperCase()); // calling methods from null after 3 iterations
    }
    // - FIX (check for null values)
    // for (String name : names) {
    // if (name != null) {
    // System.out.println(name.toUpperCase());
    // }
    // }

    // # **************InputMismatchException**************//
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a random integer");
    scanner.nextInt(); // mismatch when user enters a wrong type like string
    scanner.close();

    // - FIX (anticipate other types entered)
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Please enter a random integer");
    // if (scanner.hasNextInt()) {
    // scanner.nextInt();
    // } else {
    // scanner.next();
    // System.out.println("Please enter an integer only...");
    // }
    // scanner.close();
  }
}