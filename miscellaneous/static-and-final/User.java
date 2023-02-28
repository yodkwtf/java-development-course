public class User {
  // instance fields
  private String firstName;
  private String lastName;

  // static field
  private static int userCount = 0;

  public User(String fName, String lName) {
    userCount++;
    this.firstName = fName;
    this.lastName = lName;
  }

  // instance methods
  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  // static method
  public static int getUserCount() {
    return userCount;
  }
}