public class Workbook3 {
  public static void main(String[] args) {
    Person3 p = new Person3("Durgesh", "Indian", "04/08/2001", 5);

    System.out.println("Name: " + p.getName() + "\n" + "Nationality: " + p.getNationality() + "\n" + "Date of Birth: "
        + p.getDateOfBirth() + "\n" + "Seat Number: " + p.getSeatNumber() + "\n");

    p.setSeatNumber(10);
    System.out.println("\nName: " + p.getName() + "\n" + "Nationality: " + p.getNationality() + "\n" + "Date of Birth: "
        + p.getDateOfBirth() + "\n" + "Seat Number: " + p.getSeatNumber() + "\n");
  }
}
