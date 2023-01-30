public class WorkbookB {
  public static void main(String[] args) {
    double totalBill = 53.50;

    System.out.println(">> Waiter: I hope you enjoyed your meal! Your bill is $" + totalBill + ".");
    System.out.println(">> Customer: I did! I'll pay the bill.");
    tipTheWaiter(totalBill);
  }

  /**
   * Function name: tipTheWaiter - calculates a tip and prints it. <-----
   * 
   * @param bill (double).
   *
   *             Inside the function:
   *             1. Calculates a tip that's 15 percent of the bill you paid.
   *             2. Prints: your service was wonderful! Please, accept this tip:
   *             $<tip>
   *
   */
  public static void tipTheWaiter(double bill) {
    double tip = bill * 0.15;
    System.out.println("Your service was wonderful! Please, accept this tip: $" + tip);
  }
}
