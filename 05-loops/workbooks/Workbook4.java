public class Workbook4 {
  public static void main(String[] args) {
    for (int i = 99; i > 0; i--) {
      sing(i);
    }
  }

  /**
   * Function name -- sing
   * 
   * @param i (int)
   * @return void
   *         In the function, print the following:
   *         <i> bottles of beer on the wall, <i> bottles of beer!
   *         Take one down, pass it around, <i - 1> bottles of beer on the wall!
   */
  public static void sing(int i) {
    System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!\n" +
        "Take one down, pass it around, " + (i - 1) + " bottles of beer on the wall!");
  }
}
