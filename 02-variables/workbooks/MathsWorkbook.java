package workbooks;

public class MathsWorkbook {
  public static void main(String[] args) {
    // given data
    double profit = 0;
    int numOfCustomers = 0;
    int numOfApples = 500;
    double price = 10.5;

    // First customer buys 4 apples
    System.out.println(">> A bought 4 apples");
    profit += (price * 4);
    numOfCustomers++;
    numOfApples -= 4;

    System.out.println("Profit: " + profit);
    System.out.println("Customers: " + numOfCustomers);
    System.out.println("Apples Left: " + numOfApples);

    System.out.println("--------------------");

    // Second customer buys 20 apples
    System.out.println(">> B bought 20 apples");
    profit += (price * 20);
    numOfCustomers++;
    numOfApples -= 20;

    System.out.println("Profit: " + profit);
    System.out.println("Customers: " + numOfCustomers);
    System.out.println("Apples Left: " + numOfApples);

    System.out.println("--------------------");

    // First customer buys 4 apples
    System.out.println(">> C bought 200 apples");
    profit += (price * 200);
    numOfCustomers++;
    numOfApples -= 200;

    System.out.println("Profit: " + profit);
    System.out.println("Customers: " + numOfCustomers);
    System.out.println("Apples Left: " + numOfApples);

    System.out.println("--------------------");

    // Shop Closes
    System.out.println(">> Shop closes");

    System.out.println("Wow! So far, you made Rs. " + profit);
    System.out.println(numOfCustomers + " customers love your apples.");
    System.out.println("You have " + numOfApples + " apples left.  We'll sell more tomorrow!");

  }
}
