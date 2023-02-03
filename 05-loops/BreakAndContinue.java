public class BreakAndContinue {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      if (i % 2 == 0) { // if i is even
        continue; // skip the iteration
      }
      System.out.println(i);
    }

    // for (int i = 1; i <= 5; i++) {
    // if (i % 2 == 0) { // if i is even
    // break; // exit the loop
    // }
    // System.out.println(i);
    // }
  }
}
