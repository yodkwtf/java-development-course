package challenge;

import java.util.Scanner;

public class Challenge {
  public static void main(String[] args) {
    Movie[] movies = new Movie[] {
        new Movie("The Shawshank Redemption", "BlueRay", 9.2),
        new Movie("The Godfather", "BlueRay", 9.1),
        new Movie("The Godfather: Part II", "DVD", 9.0),
        new Movie("The Dark Knight", "BlueRay", 9.0),
        new Movie("Schindler's List", "DVD", 8.9),
        new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
        new Movie("Pulp Fiction", "DVD", 8.8),
        new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
    };

    // Create a new store
    Store store = new Store();

    // Add movies to the store
    for (int i = 0; i < movies.length; i++) {
      store.setMovie(i, movies[i]);
    }

    // Print the store
    System.out.println(store);

    // # Allow user to edit a movie's rating
    Scanner scan = new Scanner(System.in);

    // Get user's input for continue or exit
    System.out.print("\nTo edit another rating, type 'continue': ");
    String input = scan.next();

    while (input.equalsIgnoreCase("continue")) {
      // Ask user to choose a movie
      System.out.print("\nPlease choose an integer between 0 - 7: ");
      int index = scan.nextInt();

      // Get the movie
      Movie chosenMovie = store.getMovie(index);

      // Ask user to set a new rating
      System.out.print("\nSet a new rating for " + chosenMovie.getName() + ": ");
      double rating = scan.nextDouble();

      // Set the new rating
      chosenMovie.setRating(rating);

      // Update the store with the update movie
      store.setMovie(index, chosenMovie);

      // Print the store
      System.out.println(store);

      // Get user's input for continue or exit
      System.out.print("\nTo edit another rating, type 'continue': ");
      input = scan.next();
    }

    scan.close();
  }
}
