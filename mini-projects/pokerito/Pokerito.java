import java.util.Scanner;

public class Pokerito {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Let's play Pokerito. Type anything when you're ready.");
    scan.nextLine();

    System.out.println(
        "\nIt's like Poker, but a lot simpler.\n- There are two players, you and the computer.\n- The dealer will give each player one card.\n- Then, the dealer will draw five cards (the river).\n- The player with the most river matches wins!\n- If the matches are equal, everyone's a winner!\n- Ready? Type anything if you are.");
    scan.nextLine();

    // Show cards of players
    String playerCard = randomCard();
    String computerCard = randomCard();
    int playerMatches = 0;
    int computerMatches = 0;

    System.out.println("Your card:");
    System.out.println(playerCard);
    System.out.println("\nComputer's card:");
    System.out.println(computerCard);

    // Show river
    System.out.println("\nNow, the dealer will draw five cards. Press enter to continue.");
    scan.nextLine();

    for (int i = 1; i <= 5; i++) {
      String riverCard = randomCard();
      System.out.println("\nCard " + i);
      System.out.println(riverCard);

      // Check matches
      if (riverCard.equals(playerCard)) {
        playerMatches++;
      }
      if (riverCard.equals(computerCard)) {
        computerMatches++;
      }
    }

    // Show results
    System.out.println("\nPlayer matches: " + playerMatches);
    System.out.println("Computer matches: " + computerMatches);

    if (playerMatches > computerMatches) {
      System.out.println("\nYou win!");
    } else if (playerMatches < computerMatches) {
      System.out.println("\nComputer wins!");
    } else {
      System.out.println("\nEveryone wins!");
    }

    scan.close();
  }

  /**
   * Function name -- randomCard
   * 
   * @return (String)
   *
   *         Inside the function:
   *         1. Gets a random number between 1 and 13.
   *         2. Returns a card that matches the random number.
   */
  public static String randomCard() {
    int random = (int) (Math.random() * 13 + 1);

    switch (random) {
      case 1:
        return ("   _____\n" +
            "  |A _  |\n" +
            "  | ( ) |\n" +
            "  |(_'_)|\n" +
            "  |  |  |\n" +
            "  |____V|\n");

      case 2:
        return ("   _____\n" +
            "  |2    |\n" +
            "  |  o  |\n" +
            "  |     |\n" +
            "  |  o  |\n" +
            "  |____Z|\n");

      case 3:
        return ("   _____\n" +
            "  |3    |\n" +
            "  | o o |\n" +
            "  |     |\n" +
            "  |  o  |\n" +
            "  |____E|\n");

      case 4:
        return ("   _____\n" +
            "  |4    |\n" +
            "  | o o |\n" +
            "  |     |\n" +
            "  | o o |\n" +
            "  |____h|\n");

      case 5:
        return ("   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n");

      case 6:
        return ("   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n");

      case 7:
        return ("   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n");

      case 8:
        return ("   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n");

      case 9:
        return ("   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n");

      case 10:
        return ("   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n");

      case 11:
        return ("   _____\n" +
            "  |J  ww|\n" +
            "  | o {)|\n" +
            "  |o o% |\n" +
            "  | | % |\n" +
            "  |__%%[|\n");

      case 12:
        return ("   _____\n" +
            "  |Q  ww|\n" +
            "  | o {(|\n" +
            "  |o o%%|\n" +
            "  | |%%%|\n" +
            "  |_%%%O|\n");

      case 13:
        return ("   _____\n" +
            "  |K  WW|\n" +
            "  | o {)|\n" +
            "  |o o%%|\n" +
            "  | |%%%|\n" +
            "  |_%%%>|\n");

      default:
        return "Invalid Card";
    }
  }
}
