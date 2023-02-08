import java.util.Arrays;

public class TDArrays {
  public static void main(String[] args) {
    // Let's say we want to store marks of 3 students of 3 subjects.
    int[] student1 = { 90, 80, 70 };
    int[] student2 = { 80, 70, 60 };
    int[] student3 = { 70, 60, 50 };

    // This looks like multiple rows and columns of a table.
    System.out.println(Arrays.toString(student1));
    System.out.println(Arrays.toString(student2));
    System.out.println(Arrays.toString(student3));

    // # INTRODUCING 2D ARRAYS
    // int[][] marks = new int[3][3]; // slow way

    int[][] marks = {
        { 90, 80, 70 },
        { 80, 70, 60 },
        { 70, 60, 50 }
    };

    // Here each element of the array represents a row of the table.
    System.out.println(Arrays.toString(marks));

    // We can access the elements of the array using the row and column numbers.
    System.out.println(Arrays.toString(marks[0])); // [90, 80, 70]
    System.out.println(Arrays.toString(marks[1])); // [80, 70, 60]
    System.out.println(marks[0][0]); // 90
    System.out.println(marks[0][1]); // 80

    // Updating 2D Arrays
    marks[0][1] = 85;
    System.out.println(marks[0][1]);
  }
}
