import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompileTimeException {
  public static void main(String[] args) {
    // # Try to run the following code
    try {
      // opens a connection to `greetings.txt` file
      FileInputStream fis = new FileInputStream("miscellaneous/exception-handling/greetings.txt");
      // Relative Path: miscellaneous\exception-handling\greetings.txt

      // Scanner reads the data from the file
      Scanner scan = new Scanner(fis);

      // scan for values inside the file
      System.out.println(scan.nextLine());

      // close scanner
      scan.close();
    }

    // # Incase we get a `FileNotFound` exception, get the error message
    catch (FileNotFoundException exception) {
      System.out.println(exception.getMessage());
    }

    finally {
      System.out.println("Process Complete!");
    }
  }
}