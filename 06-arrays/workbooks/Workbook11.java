import java.util.Arrays;

public class Workbook11 {
  public static void main(String[] args) {
    double[] celsius = { 12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0 };

    double[] fahrenheit = celsiusToFahrenheit(celsius);

    printTemperatures(celsius, "Celsius");
    printTemperatures(fahrenheit, "Fahrenheit");
  }

  /**
   * Function name - printTemperatures
   * 
   * @param temp     ( double[] )
   * @param tempType ( String ) can be: Celsius or Fahrenheit
   *
   *                 Inside the function:
   *                 1. System.out.print(type + ": ");
   *                 2. A loop prints the temperatures in ONE line
   *                 System.out.print(temp[i] + " ");
   *                 3. Prints a new line after the loop System.out.print("\n");
   */
  public static void printTemperatures(double[] temp, String tempType) {
    System.out.print(tempType + ": ");

    for (int i = 0; i < temp.length; i++) {
      System.out.print(temp[i] + " ");
    }

    System.out.print("\n");
  }

  /**
   * Function name: celsiusToFahrenheit.
   * 
   * @param celsius ( double[] )
   * @return fahrenheit ( double[] )
   *
   *         Inside the function:
   *         1. Create a double[] array called 'fahrenheit'.
   *         2. Copies all the values from celsius to fahrenheit.
   *         3. Updates the fahrenheit values (F = (C/5 * 9) + 32).
   *         4. return fahrenheit.
   */
  public static double[] celsiusToFahrenheit(double[] celsius) {
    double[] fahrenheit = Arrays.copyOf(celsius, celsius.length);

    for (int i = 0; i < fahrenheit.length; i++) {
      fahrenheit[i] = (celsius[i] / 5 * 9) + 32;
    }

    return fahrenheit;
  }
}
