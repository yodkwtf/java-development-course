package challenge;

public class Movie {
  private String name;
  private String format;
  private double rating;

  // Constructor
  public Movie(String name, String format, double rating) {
    this.name = name;
    this.format = format;
    this.rating = rating;
  }

  // Copy Constructor
  public Movie(Movie movie) {
    this.name = movie.name;
    this.format = movie.format;
    this.rating = movie.rating;
  }

  // Getters
  public String getName() {
    return this.name;
  }

  public String getFormat() {
    return this.format;
  }

  public double getRating() {
    return this.rating;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  // toString
  public String toString() {
    return this.rating + "\t" + this.format + "\t\t" + this.name + "";
  }
}
