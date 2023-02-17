public class Workbook8 {
  public static void main(String[] args) {
    Person8[] people = new Person8[] {
        new Person8("Cleopatra", "Egypt", "69 BC", 1),
        new Person8("Alexander the Great", "Macedon", "356 BC", 2),
        new Person8("Julius Caesar", "Rome", "100 BC", 3),
        new Person8("Hannibal", "Carthage", "247 BC", 4),
        new Person8("Confucius", "China", "551 BC", 5),
        new Person8("Pericles", "Greece", "429 BC", 6),
        new Person8("Spartacus", "Thrace", "111 BC", 7),
        new Person8("Marcus Aurelius", "Rome", "121 AD", 8),
        new Person8("Leonidas", "Greece", "540 BC", 9),
        new Person8("Sun Tzu", "China", "544 BC", 10),
        new Person8("Hammurabi", "Babylon", "1750 BC", 11),
    };

    Airline airline = new Airline();

    for (int i = 0; i < people.length; i++) {
      airline.setPerson(people[i]);
    }

    System.out.println(airline.getPerson(1));
    System.out.println(airline.getPerson(5));
    System.out.println(airline.getPerson(10));
  }
}
