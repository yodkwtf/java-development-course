public class Int {
  public static void main(String[] args) {
    int passengers = 0;

    // more passengers come on bus stop
    passengers = passengers + 9;
    System.out.println(passengers);

    // passengers get off bus
    passengers = passengers - 5;
    System.out.println(passengers);

    // more people leave
    passengers -= 2;
    System.out.println(passengers);
  }
}
