public class Looping2DArrays {
  public static void main(String[] args) {
    int[][] marks = {
        { 90, 80, 70 },
        { 80, 70, 60 },
        { 70, 60, 50 }
    };

    // Loop to print every element from the row by row
    System.out.print("First row: ");
    for (int i = 0; i < marks[0].length; i++) {
      System.out.print(marks[0][i] + " "); // [0][0] [0][1] [0][2]
    }

    System.out.print("\nSecond row: ");
    for (int i = 0; i < marks[1].length; i++) {
      System.out.print(marks[1][i] + " "); // [1][0] [1][1] [1][2]
    }

    System.out.print("\nThird row: ");
    for (int i = 0; i < marks[2].length; i++) {
      System.out.print(marks[2][i] + " "); // [2][0] [2][1] [2][2]
    }

    // # NESTED LOOPS - Outer loop for every row, inner loop for elements in the row
    System.out.println("\n\nAll elements: ");

    for (int i = 0; i < marks.length; i++) {
      for (int j = 0; j < marks[i].length; j++) {
        System.out.print(marks[i][j] + " ");
      }
      System.out.print("\n");
    }
  }
}
