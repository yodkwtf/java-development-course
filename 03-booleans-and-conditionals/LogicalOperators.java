public class LogicalOperators {
  public static void main(String[] args) {
    // OR
    // person get scholarship if they get above 70 in any one
    int chemGrade = 60;
    int engGrade = 65;
    String lang = "Java";

    if (chemGrade > 70 || engGrade > 70 || lang.equals("Java")) {
      System.out.println("You got a scholarship!!!");
    } else {
      System.out.println("Haha noob");
    }

    // AND
    // person get diploma if credits > 50 and GPA > 3.5
    int credits = 52;
    double GPA = 3.45;

    if (credits >= 50 && GPA > 3.5) {
      System.out.println("You got a diploma!!!");
    } else {
      System.out.println("No diploma");
    }
  }
}
