package workbooks;

public class BioWorkbook {
  public static void main(String[] args) {
    String name = "Durgesh";
    int age = 21;
    String country = "India";
    String sport = "Cricket";
    int hours = 2;
    String game = "Rocket League";
    String subject = "Maths";
    char grade = 'A';

    System.out.println("----- My Biography -----");
    System.out.println(">> My name is " + name + ". I'm " + age + " years old, and I'm from " + country + ".");
    System.out.println(">> My favorite sport is " + sport + ". I play for " + hours + " hours a day" + ".");
    System.out.println(">> When I'm tired, I like to play " + game + ".");
    System.out.println(">> In school, my favorite subject was " + subject + ". I scored a " + grade + ".");
  }
}
