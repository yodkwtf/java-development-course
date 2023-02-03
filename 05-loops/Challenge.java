import java.util.Scanner;

public class Challenge {
  public static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Welcome to Blackjack!");
    System.out.println("...Ready? Press any key to continue.");
    scan.nextLine();

    // Show cards of players
    int playerCardNum1 = drawRandomCard();
    int playerCardNum2 = drawRandomCard();
    String playerCard1 = randomCard(playerCardNum1);
    String playerCard2 = randomCard(playerCardNum2);
    int playerTotal = Math.min(playerCardNum1, 10) + Math.min(playerCardNum2, 10);

    System.out.println("You get a \n" + playerCard1 + "\nand a \n" + playerCard2);
    System.out.println("Your total: " + playerTotal);

    // Show dealer's cards
    int dealerCardNum1 = drawRandomCard();
    int dealerCardNum2 = drawRandomCard();
    String dealerCard1 = randomCard(dealerCardNum1);
    String dealerCard2 = randomCard(dealerCardNum2);
    int dealerTotal = Math.min(dealerCardNum1, 10) + Math.min(dealerCardNum2, 10);

    System.out.println("\n\nThe dealer has a \n" + dealerCard1 + "\nand has a card facing down \n" + faceDown());
    System.out.println("Dealer's total: <HIDDEN>");

    // Hit or stay
    while (true) {
      System.out.println("\nHit or stay?");
      String input = hitOrStay();

      if (input.equalsIgnoreCase("stay")) {
        break;
      }

      int newCardNum = drawRandomCard();
      String newCard = randomCard(newCardNum);
      playerTotal += Math.min(newCardNum, 10);

      System.out.println("\nYou get a \n" + newCard);
      System.out.println("Your total: " + playerTotal);

      if (playerTotal > 21) {
        System.out.println("\nBust! Player loses!");
        System.exit(0);
      }
    }

    // Dealer's turn (When player stays)
    System.out.println("\n\nDealer's turn...");
    System.out.println("\n\nThe dealer has a \n" + dealerCard1 + "\nand has a card facing down \n" + dealerCard2);
    System.out.println("Dealer's total: " + dealerTotal);

    while (dealerTotal < 17) {
      int newCardNum = drawRandomCard();
      String newCard = randomCard(newCardNum);
      dealerTotal += Math.min(newCardNum, 10);

      System.out.println("\nDealer gets a \n" + newCard);
      System.out.println("Dealer's total: " + dealerTotal);

      if (dealerTotal > 21) {
        System.out.println("\nBust! Dealer loses!");
        System.exit(0);
      }
    }

    // Compare the total
    if (playerTotal > dealerTotal) {
      System.out.println("\nPlayer wins!");
    } else if (playerTotal < dealerTotal) {
      System.out.println("\nDealer wins!");
    } else {
      System.out.println("\nIt's a tie!");
    }

    // Close scanner
    scan.close();
  }

  /**
   * Function name -- drawRandomCard
   * 
   * @return (int)
   *
   *         Inside the function:
   *         1. Gets a random number between 1 and 13.
   *         2. Returns a card.
   */
  public static int drawRandomCard() {
    int randomNum = (int) (Math.random() * 13) + 1;
    return randomNum;
  }

  /**
   * Function name -- hitOrStay
   * 
   * @return (String)
   *
   *         Inside the function:
   *         1. Asks the user to hit or stay.
   *
   *         2. If the user doesn't enter "hit" or "stay"
   *         Run a while loop
   *         During each run, println: Please write 'hit' or 'stay'
   *
   *         3. Returns the user's option
   */
  public static String hitOrStay() {
    String input = scan.nextLine();

    while (!input.equals("hit") && !input.equals("stay")) {
      System.out.println("Please write 'hit' or 'stay'");
      input = scan.nextLine();
    }

    return input;
  }

  public static String faceDown() {
    return "   _____\n" +
        "  |     |\n" +
        "  |  J  |\n" +
        "  | JJJ |\n" +
        "  |  J  |\n" +
        "  |_____|\n";
  }

  /**
   * Function name -- randomCard
   * 
   * @param cardNum (int)
   * @return (String)
   *
   *         Inside the function:
   *         1. Gets a card number between 1 and 13.
   *         2. Returns a card that matches the card number.
   */
  public static String randomCard(int cardNum) {
    switch (cardNum) {
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
