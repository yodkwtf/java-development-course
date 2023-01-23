public class BooleanComparisons {
  public static void main(String[] args) {
    int chemGrade = 95;
    int bioGrade = 75;
    int engGrade = 75;
    double sales = 37.55;
    double costs = 5.55;

    // greater than
    System.out.println(bioGrade > chemGrade); // false

    // less than
    System.out.println(costs < sales); // true

    // greater than or equal to
    System.out.println(engGrade >= chemGrade); // false
    System.out.println(engGrade >= bioGrade); // true

    // less than or equal to
    System.out.println(engGrade <= chemGrade); // true
    System.out.println(engGrade <= bioGrade); // true

    // equal to
    System.out.println(engGrade == chemGrade); // false
    System.out.println(engGrade == bioGrade); // true

    // not equal to
    System.out.println(engGrade != chemGrade); // true
    System.out.println(engGrade != bioGrade); // false

    // equals (`equal to` for string)
    String phrase = "I am Batman!";
    String phrase2 = "I am Batman!";
    String phrase3 = "I am batman!";
    System.out.println(phrase.equals(phrase2)); // true
    System.out.println(phrase.equals(phrase3)); // false
    System.out.println(phrase.equalsIgnoreCase(phrase3)); // true

    // \ !equals (not equal to for Sting)
    System.out.println(!phrase.equals(phrase2)); // false
    System.out.println(!phrase.equals(phrase3)); // true
    System.out.println(!phrase.equalsIgnoreCase(phrase3)); // false
  }
}
