import java.util.Scanner;

public class ScannerSurvey {
    public static void main(String[] args) {
        // ********* PART A: PICKING UP THE USER'S ANSWERS *********
        System.out.println("Welcome. Thank you for taking the survey!");

        // create a new instance of scanner
        Scanner scanner = new Scanner(System.in);
        int quesCount = 0;

        System.out.println("\n>> What is your name?");
        String name = scanner.nextLine(); // wait for user to enter a text
        quesCount++;

        System.out.println("\n>> How much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble(); // get `double` value
        quesCount++;

        System.out.println("\n>> How much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();
        quesCount++;

        System.out.println("\n>> How many times a week do you buy coffee?");
        int coffeeAmount = scanner.nextInt();
        quesCount++;

        System.out.println("\n>> How many times a week do you buy fast food?");
        int foodAmount = scanner.nextInt();
        quesCount++;

        // close the scanner
        scanner.close();

        // ********* PART B: RESPONDING TO THE USER **********
        System.out.println("\nThank you " + name + " for answering all " + quesCount + " questions.");
        System.out.println("Weekly, you spend $" + (coffeeAmount * coffeePrice) + " on coffee.");
        System.out.println("Weekly, you spend $" + (foodAmount * foodPrice) + " on food.");
    }
}
