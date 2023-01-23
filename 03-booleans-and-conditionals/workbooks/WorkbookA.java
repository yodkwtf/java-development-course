public class WorkbookA {
  public static void main(String[] args) {
    double change = 3.50;
    double price = 2.50;
    System.out.println("Me: Hi Java, do I have enough change to buy chips?");
    System.out.println("Java: " + (change >= price) + "\n");

    int capacity = 12;
    int people = 15;
    System.out.println("Me: Hi Java, can the elevator hold everyone?");
    System.out.println("Java: " + (capacity >= people) + "\n");

    String giftAsked = "Video Game";
    String giftBought = "Physics Book";
    System.out.println("Me: Hi Java, will my friend be happy?");
    System.out.println("Java: " + (giftAsked.equalsIgnoreCase(giftBought)) + "\n");

    int space = 10;
    int guests = 5;
    System.out.println("Me: Hi Java, can everyone attend my dinner party?");
    System.out.println("Java: " + (space >= guests) + "\n");

    int myVotes = 27;
    int theirVotes = 35;
    System.out.println("Me: Hi Java, will I win the election?");
    System.out.println("Java: " + (myVotes > theirVotes) + "\n");
  }
}
