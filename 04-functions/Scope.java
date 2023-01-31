public class Scope {
  static int dogs = 15;

  public static void main(String[] args) {
    System.out.println("dogs: " + dogs); // 15
    someFunction();
  }

  public static void someFunction() {
    System.out.println("dogs: " + dogs); // 15

    int apples = 5;
    System.out.println("apples: " + apples); // 5
  }
}
