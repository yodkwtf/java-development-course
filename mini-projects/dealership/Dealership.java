import java.util.Scanner;

public class Dealership {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // welcome message
    System.out.println("Welcome to the Java Dealership!");

    System.out.println(">> Select option 'a' to buy a car");
    System.out.println(">> Select option 'b' to sell a car");

    // get user input
    String option = scan.nextLine();

    // check user input
    switch (option) {
      case "a":
        // get client budget
        System.out.println("\n>> What is your budget?");
        int budget = scan.nextInt();

        // check budget
        if (budget >= 10000) {
          System.out.println("\n- Great! A swift dezire is available!");

          // check if client has insurance
          System.out.println("\n>> Do you have insurance? (y/n)");
          String insurance = scan.next();

          // check if client has license
          System.out.println("\n>> Do you have a license? (y/n)");
          String license = scan.next();

          // check credit score
          System.out.println("\n>> What is your credit score?");
          int creditScore = scan.nextInt();

          // check if client is eligible
          if (insurance.equals("y") && license.equals("y") && creditScore >= 600) {
            System.out.println("\n- Congratulations! You are eligible to buy a car.");
          } else {
            System.out.println("\n- Sorry, you are not eligible to buy a car.");
          }

        } else {
          System.out.println("\n- Sorry, you don't have enough budget.");
        }
        break;

      case "b":
        // get car cost price
        System.out.println("\n>> What is your car's original price?");
        int costPrice = scan.nextInt();

        // get car selling price
        System.out.println("\n>> What is your car's selling price?");
        int sellingPrice = scan.nextInt();

        // check if client is eligible
        if (sellingPrice < costPrice && sellingPrice < 30000) {
          System.out.println("\n- Congratulations! You are eligible to sell your car.");
        } else {
          System.out.println("\n- Sorry, you are not eligible to sell your car.");
        }
        break;

      default:
        System.out.println(">> Invalid option. Please try again.");
    }

    // close scanner
    scan.close();
  }
}