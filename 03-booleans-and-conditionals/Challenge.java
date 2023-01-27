import java.util.Scanner;

public class Challenge {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // welcome user to quiz
    System.out.println("Welcome to the quiz!");
    int score = 0;

    // question 1
    System.out.println("\n1. Which country held the 2016 Summer Olympics?");
    System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
    System.out.print("Your answer: ");
    String answer1 = input.nextLine();

    // question 2
    System.out.println("\n2. Which planet is the hottest?");
    System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
    System.out.print("Your answer: ");
    String answer2 = input.nextLine();

    // question 3
    System.out.println("\n3. What is the rarest blood type?");
    System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
    System.out.print("Your answer: ");
    String answer3 = input.nextLine();

    // question 4
    System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
    System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
    System.out.print("Your answer: ");
    String answer4 = input.nextLine();

    // close scanner
    input.close();

    // check answers
    if (answer1.equals("c")) {
      score += 5;
    }
    if (answer2.equals("a")) {
      score += 5;
    }
    if (answer3.equals("d")) {
      score += 5;
    }
    if (answer4.equals("a") || answer4.equals("b")) {
      score += 5;
    }

    // results
    System.out.println("\nYour final score is " + score + "/20!");
    if (score >= 15) {
      System.out.println("Wow, you know your stuff!");
    } else if (score >= 5) {
      System.out.println("You did okay!");
    } else {
      System.out.println("Better luck next time!");
    }
  }
}
