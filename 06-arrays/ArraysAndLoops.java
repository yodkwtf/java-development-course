public class ArraysAndLoops {
  public static void main(String[] args) {
    String[] names = { "John", "Mary", "Bob" };

    System.out.println("The length of the array is " + names.length); // 3

    for (int i = 0; i < names.length; i++) {
      System.out.println("The element at index " + i + " is " + names[i]);
    }
  }
}