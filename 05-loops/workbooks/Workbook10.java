public class Workbook10 {
  public static void main(String[] args) {
    // ROLL DOUBLES
    // The user must keep rolling dice until they roll doubles!

    int dice1 = rollDice();
    int dice2 = rollDice();

    System.out.println("Dice 1: " + dice1);
    System.out.println("Dice 2: " + dice2 + "\n");

    while (dice1 != dice2) {
      dice1 = rollDice();
      dice2 = rollDice();

      System.out.println("Dice 1: " + dice1);
      System.out.println("Dice 2: " + dice2 + "\n");
    }

    System.out.println("You rolled doubles!");
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
