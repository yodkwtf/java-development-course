public class Variables {
  public static void main(String[] args) {
    int passengers = 5;
    System.out.println(passengers);

    // copying values from other variables
    int busTickets = passengers;
    System.out.println(busTickets);

    // int maxValue = 2147483648; // out of range
    int maxValue = 2147483647; // withtin range
    System.out.println(maxValue);
  }
}
