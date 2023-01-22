import java.util.Scanner;

public class Challenge {
  public static void main(String[] args) {
    // Create a chatbot
    Scanner scan = new Scanner(System.in);

    System.out.println("ChatterBot >>: A Java Chatbot");

    System.out.println("\n>> What is your name?");
    String name = scan.nextLine();

    System.out.println("\n>> Hi " + name + " ! I'm ChatterBot. Where are you from?");
    String city = scan.nextLine();

    System.out.println("\n>> I hear it's beautiful at " + city + "! I'm from a place called Oracle.");
    System.out.println("How old are you?");
    int age = scan.nextInt();

    System.out.println("\n>> So you're " + age + ", cool! I'm 400 years old.");
    System.out.println("This means I'm about " + (400 / age) + " times older than you.");
    System.out.println("Enough about me. What's your favorite langauge? (Just don't say Python)");
    scan.nextLine(); // throwaway
    String language = scan.nextLine();

    System.out.println(
        "\n>> " + language + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");

    scan.close();

    System.out.println("ChatterBot >>: A Java Chatbot");
  }
}
