public class ReturnStatements {
  public static void main(String[] args) {
    double area1 = calculateArea(10, 20);
    double area2 = calculateArea(9.3, 21);

    System.out.println("Area 1: " + area1 + " units sq."); // 200.0
    System.out.println("Area 2: " + area2 + " units sq."); // 195.3
  }

  // `double` -> return type
  public static double calculateArea(double length, double breadth) {
    double area = length * breadth;
    return area; // `return` statement
  }
}