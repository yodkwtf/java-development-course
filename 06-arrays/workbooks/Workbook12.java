import java.util.Arrays;

public class Workbook12 {
  public static void main(String[] args) {
    int[] ticket = { 34, 43, 45, 65, 21, 54 };

    int[] ticket2 = Arrays.copyOf(ticket, ticket.length);
    ticket2[2] = 54;

    printTicketNumbers(ticket);
    printTicketNumbers(ticket2);
  }

  /**
   * Function name -- printTicketNumbers
   * 
   * @param ticket ( int[] )
   *
   *               Inside the function:
   *               1. Use a loop to print the numbers in one line.
   *               System.out.print(ticket[i] + " ");
   *
   *               2. After the loop, print two new lines.
   *               System.out.print("\n\n");
   *
   */
  public static void printTicketNumbers(int[] ticket) {
    for (int i = 0; i < ticket.length; i++) {
      System.out.print(ticket[i] + " ");
    }
    System.out.print("\n\n");
  }
}
