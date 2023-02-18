package challenge;

public class Store {
  private Movie[] movies;

  // # Constructor
  public Store() {
    this.movies = new Movie[8];
  }

  // # Getters
  public Movie getMovie(int index) {
    return new Movie(this.movies[index]);
  }

  // # Setters
  public void setMovie(int index, Movie movie) {
    this.movies[index] = new Movie(movie);
  }

  // # Methods
  @Override
  public String toString() {
    String output = "\n********************************MOVIE STORE*******************************\n";
    output += "RATING\tFORMAT\t\t\tNAME\n";
    for (int i = 0; i < this.movies.length; i++) {
      output += this.movies[i] + "\n";
    }
    return output;
  }
}
