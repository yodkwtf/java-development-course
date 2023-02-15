import java.util.Arrays;

public class Workbook1 {
  public static void main(String[] args) {
    Person p = new Person();

    System.out.println(p.name);
    System.out.println(p.nationality);
    System.out.println(p.dateOfBirth);
    System.out.println(Arrays.toString(p.passport));
    System.out.println(p.seatNumber);

    // Adding values
    p.name = "Durgesh";
    p.nationality = "Indian";
    p.dateOfBirth = "04/08/2001";
    p.passport = new String[] { p.name, p.nationality, p.dateOfBirth };
    p.seatNumber = 12456;

    System.out.println("\nAFTER ADDING VALUES\n");
    System.out.println(p.name);
    System.out.println(p.nationality);
    System.out.println(p.dateOfBirth);
    System.out.println(Arrays.toString(p.passport));
    System.out.println(p.seatNumber);
  }
}
