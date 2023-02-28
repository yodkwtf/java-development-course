public class StaticKeyword {
  public static void main(String[] args) {
    User liam = new User("Liam", "Smith"); // userCount = 1
    User olivia = new User("Olivia", "Davis"); // userCount = 2
    User ethan = new User("Ethan", "Martins"); // userCount = 3

    // instance methods
    System.out.println(liam.getFirstName() + " " + liam.getLastName()); // Liam Smith
    System.out.println(olivia.getFirstName() + " " + olivia.getLastName()); // Olivia Davis
    System.out.println(ethan.getFirstName() + " " + ethan.getLastName()); // Ethan Martins

    // static method
    System.out.println(User.getUserCount()); // 3
  }
}
