public class Person8 {
  private String name;
  private String nationality;
  private String dateOfBirth;
  private int seatNumber;

  // # Constructor
  public Person8(String name, String nationality, String dateOfBirth, int seatNumber) {
    this.name = name;
    this.nationality = nationality;
    this.dateOfBirth = dateOfBirth;
    this.seatNumber = seatNumber;
  }

  // Copy constructor
  public Person8(Person8 source) {
    this.name = source.name;
    this.nationality = source.nationality;
    this.dateOfBirth = source.dateOfBirth;
    this.seatNumber = source.seatNumber;
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

  // Methods
  public String toString() {
    return "Name: " + this.name + "\n" + "Nationality: " + this.nationality + "\n" + "Date of Birth: "
        + this.dateOfBirth + "\n" + "Seat Number: " + this.seatNumber + "\n";
  }
}
