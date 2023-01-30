public class DocComments {
  public static void main(String[] args) {

  }

  /**
   * Function name: greet
   * 
   * Inside the function:
   * 1. prints "Hello!"
   */
  public static void greet() {
    System.out.println("Hello!");
  }

  /**
   * Function name: printText
   * 
   * @param name (String)
   * @param age  (int)
   * @return msg (String)
   * 
   *         Inside the function:
   *         1. Build the message: "Hi, my name is <name> and I am <age> years
   *         old."
   *         2. return the message
   */
  public static String printText(String name, int age) {
    String msg = "Hi, my name is " + name + " and I am " + age + " years old.";
    return msg;
  }
}
