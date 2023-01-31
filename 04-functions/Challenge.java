import java.util.Scanner;

public class Challenge {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Start the game
    System.out.println(">> Let's play Rock, Paper, Scissors!");
    System.out.println(">> When I say 'shoot', Choose: rock, paper, or scissors.\n");
    System.out.println("Are you ready? (yes/no)");

    String ready = scan.nextLine();

    if (ready.equals("yes")) {
      System.out.println("Great!");
      System.out.println("rock - paper - scissors, shoot!");
    } else {
      System.out.println("Darn, some other time...!");
      System.exit(0);
    }

    // Get choices
    String playerChoice = scan.nextLine();
    String computerChoice = computerChoice();

    // Get the result
    String result = result(playerChoice, computerChoice);

    // Print the result
    printResult(playerChoice, computerChoice, result);

    scan.close();
  }

  /**
   * Name: computerChoice
   * Description: This function will return a random choice for the computer
   * 
   * @return String
   */
  public static String computerChoice() {
    int random = (int) (Math.random() * 3);

    if (random == 0) {
      return "rock";
    } else if (random == 1) {
      return "paper";
    } else {
      return "scissors";
    }
  }

  /**
   * Name: result
   * Description: This function will return the result of the game
   * 
   * @param yourChoice     (String)
   * @param computerChoice (String)
   * @return String
   */
  public static String result(String yourChoice, String computerChoice) {
    if (yourChoice.equals("rock")) {
      if (computerChoice.equals("rock")) {
        return "It's a tie!";
      } else if (computerChoice.equals("paper")) {
        return "You lose!";
      } else {
        return "You win!";
      }
    }

    else if (yourChoice.equals("paper")) {
      if (computerChoice.equals("rock")) {
        return "You win!";
      } else if (computerChoice.equals("paper")) {
        return "It's a tie!";
      } else {
        return "You lose!";
      }
    }

    else if (yourChoice.equals("scissors")) {
      if (computerChoice.equals("rock")) {
        return "You lose!";
      } else if (computerChoice.equals("paper")) {
        return "You win!";
      } else {
        return "It's a tie!";
      }
    }

    return "INVALID CHOICE";
  }

  /**
   * Name: printResult
   * Description: This function will print the result of the game
   * 
   * @param yourChoice     (String)
   * @param computerChoice (String)
   * @param result         (String)
   */
  public static void printResult(String yourChoice, String computerChoice, String result) {
    System.out.println("\nYou chose: " + yourChoice);
    System.out.println("Computer chose: " + computerChoice);
    System.out.println(result);
  }
}
