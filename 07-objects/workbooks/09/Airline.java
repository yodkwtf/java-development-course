public class Airline {
  private Person[] people;

  // # Constructor
  public Airline() {
    this.people = new Person[11];
  }

  // # Getters
  public Person getPerson(int index) {
    return new Person(this.people[index]);
  }

  // # Setters
  public void setPerson(Person person) {
    this.people[person.getSeatNumber() - 1] = new Person(person); // Copy constructor to avoid creating a reference to
                                                                  // the same object
  }

  // # Methods
  public void createReservations(Person person) {
    // check if the spot is already taken (spot is not empty or null)
    while (this.people[person.getSeatNumber() - 1] != null) {
      System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber()
          + " is already taken. Please choose another seat.\n");
      person.chooseSeat();
    }

    // if spot is null, i.e., it's empty, then add the person to the array
    this.people[person.getSeatNumber() - 1] = new Person(person); // Copy constructor to avoid creating a reference to
                                                                  // the same object
    System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is "
        + person.getSeatNumber() + ".\n");
  }
}
