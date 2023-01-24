public class WorkbookD {
  public static void main(String[] args) {
    int temp = -12;
    String forecast;

    if (temp <= -1) {
      forecast = "The forecast is FREEZING! Stay home!";
    } else if (temp <= 10) {
      forecast = "The forecast is Chilly. Wear a coat!";
    } else {
      forecast = "It's warm. Go outside!";
    }

    System.out.println(forecast);
  }
}
