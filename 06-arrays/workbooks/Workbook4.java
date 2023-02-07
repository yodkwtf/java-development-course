import java.util.Scanner;

public class Workbook4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] aisles = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };

    System.out.println(">>: Welcome to Java Grocers.\n>>: What can I help you find?");
    String item = scan.nextLine();

    for (int i = 0; i < aisles.length; i++) {
      if (aisles[i].equals(item)) {
        System.out.println("\nWe have that in aisle: " + i);
      }
    }

    scan.close();
  }
}
