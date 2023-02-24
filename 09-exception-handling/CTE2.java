import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CTE2 {
  public static void main(String[] args) {
    try {
      readFile("miscellaneous/exception-handling/greetings.txt");
    } catch (FileNotFoundException exception) {
      System.out.println(exception.getMessage());
    } finally {
      System.out.println("Process Complete!");
    }
  }

  // function to read file which may throw `FileNotFoundException`
  public static void readFile(String fileName) throws FileNotFoundException {
    FileInputStream fis = new FileInputStream("greetings.txt");
    Scanner scanner = new Scanner(fis);
    System.out.println(scanner.nextLine());
    scanner.close();
  }
}
