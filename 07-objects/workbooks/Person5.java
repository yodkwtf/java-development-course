public class Person5 {
  private String name;
  private String nationality;
  private String dateOfBirth;
  private int seatNumber;

  // Constructor
  public Person5(String name, String nationality, String dateOfBirth, int seatNumber) {
    this.name = name;
    this.nationality = nationality;
    this.dateOfBirth = dateOfBirth;
    this.seatNumber = seatNumber;
  }

  // Getters
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

  // Setters
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

  // Methods

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

  /**
   * Function name: chooseSeat
   *
   * Inside the function:
   * 1. Sets this.seat to a random number between 1 -- 11.
   */
  public void chooseSeat() {
    this.seatNumber = (int) (Math.random() * 11) + 1;
  }
}
