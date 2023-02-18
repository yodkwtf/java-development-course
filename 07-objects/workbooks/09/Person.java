import java.util.Arrays;

public class Person {
  private String name;
  private String nationality;
  private String dateOfBirth;
  private int seatNumber;
  private String[] passport;

  // # Constructor
  public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
    this.name = name;
    this.nationality = nationality;
    this.dateOfBirth = dateOfBirth;
    this.seatNumber = seatNumber;
    this.passport = new String[3];
  }

  // Copy constructor
  public Person(Person source) {
    this.name = source.name;
    this.nationality = source.nationality;
    this.dateOfBirth = source.dateOfBirth;
    this.seatNumber = source.seatNumber;
    this.passport = Arrays.copyOf(source.passport, source.passport.length);
  }

  // # Getters
  public String getName() {
    return name;
  }

  public String getNationality() {
    return nationality;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public int getSeatNumber() {
    return seatNumber;
  }

  public String[] getPassport() {
    return Arrays.copyOf(this.passport, this.passport.length);
  }

  // # Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setSeatNumber(int seatNumber) {
    this.seatNumber = seatNumber;
  }

  public void setPassport() {
    this.passport[0] = this.name;
    this.passport[1] = this.nationality;
    this.passport[2] = this.dateOfBirth;
  }

  // Methods
  public String toString() {
    return "Name: " + this.name + "\n" + "Nationality: " + this.nationality + "\n" + "Date of Birth: "
        + this.dateOfBirth + "\n" + "Seat Number: " + this.seatNumber + "\n";
  }

  /**
   * Function name: chooseSeat
   *
   * Inside the function:
   * 1. Sets this.seat to a random number between 1 -- 11.
   */
  public void chooseSeat() {
    this.seatNumber = (int) (Math.random() * 11) + 1;
  }

  /**
   * Function name: applyPassport
   * 
   * @return (boolean)
   *
   *         Inside the function:
   *         1. Returns a random boolean of true or false.
   */
  public boolean applyPassport() {
    int number = (int) (Math.random() * 2); // random int that can be 0 or 1.
    return number == 1 ? true : false;
  }
}
