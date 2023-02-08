import java.util.Scanner;

public class Challenge {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    char[][] board = new char[3][3];

    // 1. initialize the board with empty spaces
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        board[i][j] = '_';
      }
    }

    // 2. print the board
    System.out.println("Let's play tic tac toe\n");
    printBoard(board);

    // 3. Taking turn 9 times
    for (int i = 0; i < 9; i++) {
      // 3.1. Ask the user for the row and column
      if (i % 2 == 0) {
        System.out.println("\nTurn: X");
      } else {
        System.out.println("\nTurn: O");
      }

      // 3.2 Get user's spot and update the board
      int[] spot = askUser(board);
      board[spot[0]][spot[1]] = (i % 2 == 0) ? 'X' : 'O';

      // 3.3 Print the updated board
      printBoard(board);

      // 3.4 Check if there is a winner
      if (checkWinner(board) == 3) {
        System.out.println("X wins!");
        break;
      } else if (checkWinner(board) == -3) {
        System.out.println("O wins!");
        break;
      }
    }

    // 4. Check if there is a tie
    if (checkWinner(board) == 0) {
      System.out.println("It's a tie!");
    }
  }

  /**
   * Function name - printBoard()
   * 
   * @param board (char[][])
   *
   *              Inside the function:
   *              1. print a new line.
   *              2. print the board.
   *              \- separate each row by two lines.
   *              \- each row precedes a tab of space
   *              \- each character in the grid has one space from the other
   *              character
   */
  public static void printBoard(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      System.out.print("\n\t");

      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }

      System.out.println("\n");
    }

  }

  /**
   * Function name -- askUser <-------
   * 
   * @param board (char[][] board)
   * @return spot (int[])
   *
   *         Inside the function
   *         1. Asks the user: - pick the row and column:
   *         2. If the spot is taken, ask the user to choose again.
   *         3. Return the row and column in an int[] array.
   *
   */
  public static int[] askUser(char[][] board) {
    int[] spot = new int[2];

    System.out.print("- Pick the row and column number: ");
    spot[0] = scan.nextInt();
    spot[1] = scan.nextInt();

    while (board[spot[0]][spot[1]] != '_') {
      System.out.print("Spot is taken, choose again: ");
      spot[0] = scan.nextInt();
      spot[1] = scan.nextInt();
    }

    return spot;
  }

  /**
   * 
   */
  public static int checkWinner(char[][] board) {
    int count = 0;

    // Check rows
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[i][j] == 'X') {
          count++;
        } else if (board[i][j] == 'O') {
          count--;
        }
      }

      if (count == 3 || count == -3) {
        return count;
      } else {
        count = 0;
      }
    }

    // Check columns
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[j][i] == 'X') {
          count++;
        } else if (board[j][i] == 'O') {
          count--;
        }
      }

      if (count == 3 || count == -3) {
        return count;
      } else {
        count = 0;
      }
    }

    // Check left diagonal
    for (int i = 0; i < board.length; i++) {
      if (board[i][i] == 'X') {
        count++;
      } else if (board[i][i] == 'O') {
        count--;
      }
    }

    if (count == 3 || count == -3) {
      return count;
    } else {
      count = 0;
    }

    // Check right diagonal
    for (int i = 0; i < board.length; i++) {
      if (board[i][i] == 'X') {
        count++;
      } else if (board[i][i] == 'O') {
        count--;
      }
    }

    if (count == 3 || count == -3) {
      return count;
    } else {
      count = 0;
    }

    return count;
  }
}