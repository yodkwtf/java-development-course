import java.util.Scanner;

public class Workbook10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Get the number of toppings
    System.out.println("How many toppings would you want?");
    int numToppings = scan.nextInt();
    scan.nextLine();

    // Create an array to hold the toppings
    String[] toppings = new String[numToppings];
    System.out.println("\nGreat, enter each topping!");

    // Get the user to enter toppings
    for (int i = 0; i < toppings.length; i++) {
      System.out.print(i + ". ");
      toppings[i] = scan.nextLine();
    }

    // Print the toppings
    System.out.println("\nThank you! Here are your toppings:");
    for (int i = 0; i < toppings.length; i++) {
      System.out.println(i + ". " + toppings[i]);
    }

    scan.close();
  }
}
