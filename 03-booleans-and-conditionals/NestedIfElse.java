public class NestedIfElse {
  public static void main(String[] args) {
    int grade = 63;

    if (grade >= 90) { // false
      System.out.println("You got an A+ grade!");
    } else if (grade >= 80) { // false
      System.out.println("You got an A grade!");
    } else if (grade >= 70) { // false
      System.out.println("You got a B+ grade!");
    } else if (grade >= 60) { // true
      System.out.println("You got a B grade!"); // runs
    } else if (grade >= 50) { // false
      System.out.println("You got a C grade!");
    } else if (grade >= 40) { // false
      System.out.println("You got a D grade!");
    } else {
      System.out.println("You failed and got an F grade!");
    }
  }
}
