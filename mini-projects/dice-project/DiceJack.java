import java.util.Scanner;

public class DiceJack {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // roll dice
    int rol1 = rollDice();
    int rol2 = rollDice();
    int rol3 = rollDice();

    // ask for user input
    System.out.println(">> Enter three numbers between 1 and 6: ");

    // get 3 numbers from user
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();

    // check if numbers are between 1 and 6
    if (num1 < 1 || num1 > 6 || num2 < 1 || num2 > 6 || num3 < 1 || num3 > 6) {
      System.out.println("Invalid input. Please enter numbers between 1 and 6.");
      System.exit(0);
    }

    // calculate sum of rolls and user input
    int sumOfRolls = rol1 + rol2 + rol3;
    int sumOfNums = num1 + num2 + num3;

    // print results
    System.out.println("Dice sum: " + sumOfRolls);
    System.out.println("Your sum: " + sumOfNums);

    // check if user wins
    if (checkWin(sumOfRolls, sumOfNums)) {
      System.out.println("You win!");
    } else {
      System.out.println("You lose!");
    }

    scan.close();
  }

  /**
   * Roll dice
   * 
   * @return dice (int)
   */
  public static int rollDice() {
    int dice = (int) (Math.random() * 6) + 1; // 1-6
    return dice;
  }

  /**
   * Check if user wins
   * 
   * @param sumOfRolls (int)
   * @param sumOfNums  (int)
   * @return boolean
   */
  public static boolean checkWin(int sumOfRolls, int sumOfNums) {
    return (sumOfNums > sumOfRolls && (sumOfNums - sumOfRolls) < 3);
  }
}
