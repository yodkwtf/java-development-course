public class TypeCasting {
  public static void main(String[] args) {
    double salary = 5423.94;
    int roundedSalary = (int) salary; // casts `double` into `int`

    System.out.println("Mortgage Broker: What is your monthly salary in dollars?");
    System.out.println("My monthly salary is: " + salary); // 5423.94
    System.out.println("My monthly salary is: " + roundedSalary); // 5423
  }
}
