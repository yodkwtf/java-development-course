public class IfElse {
  public static void main(String[] args) {
    int grade = 65;

    if (grade > 50) { // true
      System.out.println("You passed!");
    }

    if (grade > 80) { // false
      System.out.println("You topped!");
    } else {
      System.out.println("You passed but didn't top!");
    }
  }
}