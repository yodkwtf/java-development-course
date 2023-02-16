public class Workbook5 {
  public static void main(String[] args) {
    Person5 person = new Person5("Rayan Slim", "Canadian", "01/01/1111", 5);

    // Seat change
    person.chooseSeat();

    System.out.println(
        "Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: "
            + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

    // Passport application
    if (person.applyPassport()) {
      System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");
    } else {
      System.out.println("We are sorry " + person.getName() + ". We cannot process your application.");
    }
  }
}
