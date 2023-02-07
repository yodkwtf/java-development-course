public class Workbook6 {
  public static void main(String[] args) {
    int[] numbers = new int[10];
    int highScore = 0;
    int seat = 0;

    // Create random scores for array and find the highest score
    for (int i = 0; i < numbers.length; i++) {
      int random = randomNumber();
      numbers[i] = random;
      if (random > highScore) {
        highScore = random;
      }
    }

    // Print the scores and the highest score
    System.out.print("Here are the scores: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

    // Find the seat of the highest score
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == highScore) {
        seat = i;
      }
    }
    System.out.println("It's the gentleman in seat " + seat + "!");
  }

  /**
   * Function name - randomNumber
   * 
   * @return (int)
   *
   *         Inside the function
   *         returns a random number between 0 to 49999
   *
   */
  public static int randomNumber() {
    int random = (int) (Math.random() * 50000);
    return random;
  }
}