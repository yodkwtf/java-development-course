public class WhileLoops {
  public static void main(String[] args) {
    // int num = 25;

    // while (num <= 30) {
    // System.out.println(num);
    // num++;
    // }

    // for (int i = num; i <= 30; i++) {
    // System.out.println(i);
    // }

    // CORRECT USE OF WHILE LOOP (when it's unknown how many times it needs to run)
    double choice = 0.5;
    double guess = 1;

    while (guess > choice) {
      guess = Math.random();
      System.out.println(guess);
    }
    // We get a random number between 0 and 1 on each iteration
    // We stop when the random number is less than 0.01
  }
}
