import java.util.Scanner;

public class Workbook8 {
  public static void main(String[] args) {
    // GUESS THE NUMBER
    // In this workbook, the user has to keep guessing a number until they get it
    // right.
    Scanner input = new Scanner(System.in);

    int secretNumber = 3;

    System.out.print("I chose a number between 1 and 5. Try to guess it: ");
    int guess = input.nextInt();

    while (guess != secretNumber) {
      System.out.print("Incorrect, guess again: ");
      guess = input.nextInt();
    }
    System.out.println("Correct! The number was " + secretNumber);

    input.close();
  }
}
