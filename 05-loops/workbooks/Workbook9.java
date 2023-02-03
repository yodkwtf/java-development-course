import java.util.Scanner;

public class Workbook9 {
  public static void main(String[] args) {
    // SIGNING IN
    // In this workbook, Samantha will sign into her favorite social network:
    // Javagram!

    String username = "Samantha";
    String password = "Java<3";

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Javagram! Sign in to continue.\n");
    System.out.print("\tUsername: ");
    String userGuess = input.nextLine();
    System.out.print("\tPassword: ");
    String passGuess = input.nextLine();

    while (!userGuess.equals(username) || !passGuess.equals(password)) {
      System.out.println("\nIncorrect username or password. Try again.\n");

      System.out.print("\tUsername: ");
      userGuess = input.nextLine();
      System.out.print("\tPassword: ");
      passGuess = input.nextLine();
    }

    System.out.println("\nSign in successful. Welcome, " + username + "!");
    input.close();
  }
}
