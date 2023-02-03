import java.util.Scanner;

public class Workbook11 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Let's play Rolling Java. Type anything to start.\n");
    scan.nextLine();

    System.out.println("Great, here are the rules:\n");
    System.out.println("- If you roll a 6, the game stops.");
    System.out.println("- If you roll a 4, nothing happens.");
    System.out.println("- Otherwise, you get 1 point.\n");

    System.out.print("You must collect at least 3 points to win. Enter anything to roll:\n");
    int score = 0;

    while (3 < 4) {
      scan.nextLine();
      int diceRoll = rollDice();
      System.out.print("You rolled a " + diceRoll + "!");

      if (diceRoll == 6) {
        System.out.print(" GAME OVER.\n");
        break;
      } else if (diceRoll == 4) {
        System.out.print(" Zero points. Keep rolling.\n");
        continue;
      } else {
        System.out.print(" One point. Keep rolling.\n");
        score++;
      }
    }

    System.out.println("\nYou score is: " + score);
    if (score >= 3) {
      System.out.println("Wow, that's lucky. You win!");
    } else {
      System.out.println("Tough luck, you lose :(");
    }

    scan.close();
  }

  /**
   * Function name: rollDice -- rolls a dice between 1 and 6
   * 
   * @return randomNumber (int)
   */
  public static int rollDice() {
    int randomNumber = (int) (Math.random() * 6) + 1;
    return randomNumber;
  }
}
