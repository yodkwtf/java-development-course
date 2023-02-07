public class Workbook5 {
  public static void main(String[] args) {
    int[] numbers = new int[10];
    int highScore = 0;

    for (int i = 0; i < numbers.length; i++) {
      int random = randomNumber();
      numbers[i] = random;
      if (random > highScore) {
        highScore = random;
      }
    }

    System.out.print("Here are the scores: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println("\nThe highest score is: " + highScore + ". Give that man a cookie!");
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
