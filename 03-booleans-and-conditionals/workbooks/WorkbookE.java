public class WorkbookE {
  public static void main(String[] args) {
    int day = 3;
    boolean holiday = true;

    if (holiday == true && day < 6) {
      System.out.println("Woohoo, no work!");
    } else if (day == 6 || day == 7) {
      System.out.println("It's the weekend, no work!");
    } else {
      System.out.println("Wake up at 7:00 :(");
    }
  }
}
