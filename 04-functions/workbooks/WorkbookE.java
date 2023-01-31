public class WorkbookE {
  public static void main(String[] args) {
    double square = areaSquare(2);
    double rectangle = areaRectangle(1, 2);
    double triangle = areaTriangle(1, 2);
    double circle = areaCircle(2);

    printAreas(square, rectangle, triangle, circle);
  }

  // # FUNCTIONS
  /**
   * Name: areaSquare - returns the area of a square.
   * 
   * @param side (double)
   * @return the area (double)
   *
   *         Inside the function: <---------
   *         1. If side is negative
   *         / prints "Impossible"
   *         / shuts the app down
   *         2. Calculates the area of the square. A = side²
   */
  public static double areaSquare(double side) {
    if (side < 0) {
      System.out.println("Impossible");
      System.exit(0);
    }
    return Math.pow(side, 2);
  }

  /**
   * Name: areaRectangle
   * 
   * @param length (double).
   * @param width  (double).
   * @return the area (double)
   *
   *         Inside the function: <-----
   *         1. If the length OR width is negative
   *         / print "Error: impossible" and
   *         / terminate the program.
   *         2. return the area: length * width
   */
  public static double areaRectangle(double length, double width) {
    if (length < 0 || width < 0) {
      System.out.println("Error: impossible");
      System.exit(0);
    }
    return length * width;
  }

  /**
   * Name: areaTriangle
   * 
   * @param base:   (double).
   * @param height: (double).
   * @return the area (double)
   *
   *         Inside the function:
   *         1. If the base OR height is negative
   *         - print "Error: impossible"
   *         - terminate the program.
   *         2. return the area: base * height / 2
   */
  public static double areaTriangle(double base, double height) {
    if (base < 0 || height < 0) {
      System.out.println("Error: impossible");
      System.exit(0);
    }
    return base * height / 2;
  }

  /**
   * Name: areaCircle
   * 
   * @param radius (double).
   * @return area (double)
   *
   *         Inside the function:
   *         1. If the radius is negative
   *         - print: Impossible
   *         - terminates the program
   *         2. returns the area: π * radius2
   */
  public static double areaCircle(double radius) {
    if (radius < 0) {
      System.out.println("Impossible");
      System.exit(0);
    }
    return Math.PI * Math.pow(radius, 2);
  }

  /**
   * Name: printAreas -- it prints four areas
   * 
   * @param square    (double)
   * @param rectangle (double)
   * @param triangle  (double)
   * @param circle    (double)
   *
   *                  Inside the function:
   *                  1. print: ("Square area: <square area>")
   *                  2. print: ("Rectangle area: <rectangle area>")
   *                  3. print: ("Triangle area: <triangle area>")
   *                  4. print: ("Circle area: <circle area>")
   *
   */
  public static void printAreas(double square, double rectangle, double triangle, double circle) {
    System.out.println("Square area: " + square);
    System.out.println("Rectangle area: " + rectangle);
    System.out.println("Triangle area: " + triangle);
    System.out.println("Circle area: " + circle);
  }
}
