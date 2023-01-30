public class Parameters {
  // function to calculate the area of a rectangle
  public static void calculateArea(double length, double breadth) {
    System.out.println("Area: " + length * breadth + " units sq.");
  }

  public static void main(String[] args) {
    // call the function
    calculateArea(10, 20);
    calculateArea(9.3, 21);
  }
}
