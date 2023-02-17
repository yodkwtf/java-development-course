public class Airline {
  private Person8[] people;

  // # Constructor
  public Airline() {
    this.people = new Person8[11];
  }

  // # Getters
  public Person8 getPerson(int index) {
    return new Person8(this.people[index]);
  }

  // # Setters
  public void setPerson(Person8 person) {
    this.people[person.getSeatNumber() - 1] = new Person8(person); // Copy constructor to avoid creating a reference to
                                                                   // the same object
  }
}
