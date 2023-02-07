import java.util.Arrays;

public class ReferenceTrap {
  public static void main(String[] args) {
    // //# REFERENCE TRAP
    // String[] lastYearStaff = { "John", "Mary", "Bob" };
    // String[] thisYearStaff = lastYearStaff; // Reference trap

    // // January 1st
    // System.out.println("Last year staff: " + Arrays.toString(lastYearStaff));
    // System.out.println("This year staff: " + Arrays.toString(thisYearStaff));

    // // "John" got replaced this year by "Jack" on January 2nd
    // thisYearStaff[0] = "Jack"; // Changes lastYearStaff[0] too

    // // January 3rd
    // System.out.println("\nLast year staff: " + Arrays.toString(lastYearStaff));
    // System.out.println("This year staff: " + Arrays.toString(thisYearStaff));

    // # REFERENCE TRAP FIX
    String[] lastYearStaff = { "John", "Mary", "Bob" };
    String[] thisYearStaff = new String[lastYearStaff.length]; // Create new array

    // for (int i = 0; i < lastYearStaff.length; i++) {
    // thisYearStaff[i] = lastYearStaff[i]; // Copy each element
    // } // OR
    thisYearStaff = Arrays.copyOf(lastYearStaff, lastYearStaff.length); // Copy array

    // January 1st
    System.out.println("Last year staff: " + Arrays.toString(lastYearStaff));
    System.out.println("This year staff: " + Arrays.toString(thisYearStaff));

    // "John" got replaced this year by "Jack" on January 2nd
    thisYearStaff[0] = "Jack"; // Does not change lastYearStaff[0]

    // January 3rd
    System.out.println("\nLast year staff: " + Arrays.toString(lastYearStaff));
    System.out.println("This year staff: " + Arrays.toString(thisYearStaff));
  }
}
