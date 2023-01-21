public class MetricsWorkbook {
  public static void main(String[] args) {
    // given metrics
    double sales = 24309.65;
    double profit = 18562.18;
    double refunds = 688.78;
    double shipping = 1233.57;

    // No one cares about decimals in meetings so present integers
    // Step 1 -> Convert
    int nSales = (int) sales;
    int nProfit = (int) profit;
    int nRefunds = (int) refunds;
    int nShipping = (int) shipping;

    // Step 2 -> Present
    System.out.println(">> This month, we made $" + nSales + " in sales.");
    System.out.println(">> Factoring in costs, we made $" + nProfit + " in profit.");
    System.out.println(">> The refunds are at a low $" + nRefunds + ". This is a good sign!");
    System.out.println(">> Shipping costs were high. We paid $" + nShipping + " in shipping.");
  }
}
