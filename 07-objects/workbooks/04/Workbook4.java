public class Workbook4 {
  public static void main(String[] args) {
    // Durgesh (constructor)
    Person4 durgesh = new Person4("Durgesh", "Indian", "04/08/2001", 5);

    System.out.println(
        "Name: " + durgesh.getName() + "\n" + "Nationality: " + durgesh.getNationality() + "\n" + "Date of Birth: "
            + durgesh.getDateOfBirth() + "\n" + "Seat Number: " + durgesh.getSeatNumber() + "\n");

    // Twin brother of Durgesh (copy constructor)
    Person4 roshan = new Person4(durgesh);
    roshan.setName("Roshan");
    roshan.setSeatNumber(10);
    roshan.setDateOfBirth("10/12/1995");

    System.out.println(
        "Name: " + roshan.getName() + "\n" + "Nationality: " + roshan.getNationality() + "\n" + "Date of Birth: "
            + roshan.getDateOfBirth() + "\n" + "Seat Number: " + roshan.getSeatNumber() + "\n");
  }
}
