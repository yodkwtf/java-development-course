public class WorkbookB {
  public static void main(String[] args) {
    double wallet = 100;

    System.out.println("\nCan you buy me this chips?");

    double chipsPrice = 30.0;
    if (wallet >= chipsPrice) {
      System.out.println(">>: Sure!");
      wallet -= chipsPrice;
    } else {
      System.out.println(">>: Sorry, I only have " + wallet + "$ left.");
    }

    double shoePrice = 60.0;
    if (wallet >= shoePrice) {
      System.out.println(">>: Sure!");
      wallet -= shoePrice;
    } else {
      System.out.println(">>: Sorry, I only have " + wallet + "$ left.");
    }

    double bagPrice = 25.0;
    if (wallet >= bagPrice) {
      System.out.println(">>: Sure!");
      wallet -= bagPrice;
    } else {
      System.out.println(">>: Sorry, I only have " + wallet + "$ left.");
    }
  }
}
