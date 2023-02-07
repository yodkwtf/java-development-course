public class Workbook7 {
  public static void main(String[] args) {
    String[] record = { "WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS" };
    int wins = 0;
    int losses = 0;

    for (int i = 0; i < record.length; i++) {
      if (record[i] == "WIN") {
        wins++;
      } else {
        losses++;
      }
    }

    System.out.println("Wins: " + wins);
    System.out.println("Losses: " + losses);
  }
}
