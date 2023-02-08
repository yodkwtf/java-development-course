import java.util.Scanner;

public class Javapedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Welcome message
    System.out.println("************ Javapedia! ************");

    // Ask how many entries to register
    System.out.println("How many historical figures will you register?");
    int n = scan.nextInt();
    scan.nextLine();

    // Create 2D array for entries
    String[][] database = new String[n][3];

    // Populate database by asking for name, DOB, and occupation
    for (int i = 0; i < database.length; i++) {
      System.out.println("\nFigure " + (i + 1));

      System.out.print("\t- Name: ");
      database[i][0] = scan.nextLine();

      System.out.print("\t- Date of birth: ");
      database[i][1] = scan.nextLine();

      System.out.print("\t- Occupation: ");
      database[i][2] = scan.nextLine();
    }

    // Print database created
    print2DArray(database);

    // Ask for a name to search
    System.out.print("\nWho do you want information on? ");
    String name = scan.nextLine();

    // Search for name in database
    for (int i = 0; i < database.length; i++) {
      if (database[i][0].equals(name)) {
        System.out.print("\n\tName: " + database[i][0]);
        System.out.print("\n\tDate of birth: " + database[i][1]);
        System.out.print("\n\tOccupation: " + database[i][2]);
        break;
      }
    }

    // Close scanner
    scan.close();
  }

  /**
   * Function name: print2DArray
   * 
   * @param array (String[][])
   *
   *              Inside the function
   *              1. print the database
   *              \- a tab of space precedes each row.
   *              \- each value in database has one space from the other value.
   */
  public static void print2DArray(String[][] array) {
    System.out.println("\nThese are the values you stored:");

    for (int i = 0; i < array.length; i++) {
      System.out.print("\t");

      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }

      System.out.print("\n");
    }
  }
}
