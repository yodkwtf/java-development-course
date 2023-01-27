import java.util.Scanner;

public class WorkbookG {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n****ROYAL BANK OF JAVA****");

    System.out.println("\n>> Are you here for a loan? (y/n)");
    String wantsLoan = input.next();

    // if client is here for a loan
    if (wantsLoan.equals("y")) {
      // ask for savings and debt
      System.out.println("\nGreat! Let's get started." +
          "\n>> How much money do you have in your savings?" +
          "\n>> And, how much do you owe in credit card debt?");

      // get savings and debt
      int savings = input.nextInt();
      int debt = input.nextInt();

      // get no. of years they worked for
      System.out.println("\n>> How many years have you worked for?");
      int yearsWorked = input.nextInt();

      // get user's name
      System.out.println("\n>> What is your name?");
      input.nextLine();
      String name = input.nextLine();

      // check if they qualify for a loan
      if (savings > 10000 && debt < 5000 && yearsWorked > 2) {
        System.out.println("\nCongratulations " + name + ", you qualify for a loan!");
      } else {
        System.out.println("\nSorry " + name + ", you do not qualify for a loan.");
      }
    } else {
      System.out.println("\nNo problem. Have a nice day!");
    }

    // close scanner
    input.close();
  }
}
