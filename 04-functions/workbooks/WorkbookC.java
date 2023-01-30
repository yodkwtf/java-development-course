public class WorkbookC {
  public static void main(String[] args) {
    // test cases (Fahrenheit)
    double noon = 77;
    double evening = 61;
    double midnight = 55;

    // call the function
    printTemperatures(noon);
    printTemperatures(evening);
    printTemperatures(midnight);
  }

  /**
   * Function name: fahrenheitToCelsius. <-----
   * 
   * @param fahrenheit (double)
   * @return celsius (double)
   *
   *         Inside the function:
   *         1. return the celsius temperature. C = (F - 32) * 5/9
   */
  public static double fahrenheitToCelsius(double fahrenheit) {
    double celsius = (fahrenheit - 32) * 5 / 9;
    return celsius;
  }

  /**
   * Name: printTemperatures <-----
   * 
   * @param fahrenheit (double)
   *
   *                   Inside the function:
   *                   1. prints the fahrenheit value: "F: <temp in fahrenheit>".
   *                   2. calls fahrenheitToCelsius, and
   *                   prints the celsius value: "C: <temp in celsius> \n".
   */
  public static void printTemperatures(double fahrenheit) {
    System.out.println("F: " + fahrenheit);
    double celsius = fahrenheitToCelsius(fahrenheit);
    System.out.println("C: " + celsius + "\n");
  }
}
