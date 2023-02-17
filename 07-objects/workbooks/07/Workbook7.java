import java.util.Arrays;

public class Workbook7 {
  public static void main(String[] args) {
    Person7 person = new Person7("Rayan Slim", "Canadian", "01/01/1111", 5);

    System.out.println(
        "Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: "
            + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n" + "Passport: " +
            Arrays.toString(person.getPassport()) + "\n");

    // Passport application
    if (person.applyPassport()) {
      System.out.println("Congratulations " + person.getName() + ". Your passport was approved!\n");
      person.setPassport();
    } else {
      System.out.println("We are sorry " + person.getName() + ". We cannot process your application.\n");
    }

    // Printing the object
    System.out.println(person);
  }
}