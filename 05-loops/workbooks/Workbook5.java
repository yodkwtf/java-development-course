import java.util.Scanner;

public class Workbook5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("I hear you like to count by threes");
    System.out.println("\nJimmy: It depends.\nOh, ok...\n");

    System.err.print("1. Pick a number to count by: ");
    int countBy = scan.nextInt();

    System.err.print("2. Pick a number to start at: ");
    int startAt = scan.nextInt();

    System.err.print("3. Pick a number to count to: ");
    int countTo = scan.nextInt();

    System.out.println("\nOk, here we go...\n");

    for (int i = startAt; i <= countTo; i += countBy) {
      System.out.print(i + " ");
    }

    scan.close();
  }
}
