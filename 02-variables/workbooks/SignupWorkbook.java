package workbooks;

import java.util.Scanner;

public class SignupWorkbook {
  public static void main(String[] args) {
    // new instance of scanner
    Scanner scanner = new Scanner(System.in);

    // Get user data
    System.out.println(">> Please enter your First Name:");
    String firstName = scanner.nextLine();

    System.out.println("\n>> Please enter Last Name:");
    String lastName = scanner.nextLine();

    System.out.println("\n>> Please enter your Age:");
    int age = scanner.nextInt();

    System.out.println("\n>> Please enter your Username:");
    scanner.nextLine();
    String username = scanner.nextLine();

    // close scanner instance
    scanner.close();

    // Print user data
    System.out.println("\nHere is the information you entered:");
    System.out.println("\tFirst Name: " + firstName);
    System.out.println("\tLast Name: " + lastName);
    System.out.println("\tAge: " + age);
    System.out.println("\tUsername: " + username);
  }
}
