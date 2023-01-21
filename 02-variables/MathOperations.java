public class MathOperations {
    public static void main(String[] args) {

        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 250_000_000_000L; // 250 billion
        long starsInAndromeda = 1_000_000_000_000L; // 1 trillion

        double testScore = 6.7;

        // add
        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets.");
        System.out.println(
                "There are " + (starsInMilkyWay + starsInAndromeda)
                        + "  stars in the Milky Way and Andromeda galaxies.");

        // subtract
        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + "  more sweets than George");
        System.out.println(
                "The Andromeda Galaxy has " + (starsInAndromeda - starsInMilkyWay)
                        + "  more stars than the Milky Way");

        // multiple
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: "
                + (testScore * 1.25) + "/10");

        // divide
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScore / 2));

        // modulus
        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10 % 2));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5 % 2));

        int counter = 0;
        System.out.println(counter);
        System.out.println(counter++); // print 0 and then increments by 1
        System.out.println(counter++); // print 1 and then increments by 1
        System.out.println(counter++);
        System.out.println(counter++);

        System.out.println(counter--); // prints 4 and decrements counter by 1 making it 3 after printing
        System.out.println(counter--); // prints 3 and makes it 2
        System.out.println(counter); // 2
    }
}