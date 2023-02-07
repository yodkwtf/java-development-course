public class Workbook8 {
  public static void main(String[] args) {
    String[] apples = { "Gala", "Granny Smith", "Macintosh" };
    double[] prices = { 1.99, 1.49, 1.29 };

    System.out.println("Here's your receipt:\n");

    for (int i = 0; i < apples.length; i++) {
      System.out.println("\t" + apples[i] + ": $" + prices[i]);
    }
  }
}
