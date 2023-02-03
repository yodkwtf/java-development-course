public class Arrays {
  public static void main(String[] args) {
    // bad way
    // String name1 = "John";
    // String name2 = "Mary";
    // String name3 = "Bob";

    // good way
    String[] names = { "John", "Mary", "Bob" };
    System.out.println(names); // [Ljava.lang.String;@5acf9800 (memory address)
    System.out.println(names[0]); // John
    System.out.println(names[1]); // Mary
    System.out.println(names[2]); // Bob
    System.out.println(names[3]); // error
  }
}