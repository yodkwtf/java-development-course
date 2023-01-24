public class WorkbookC {
  public static void main(String[] args) {
    // points
    int gryffindorPoints = 100;
    int ravenclawPoints = 500;

    if ((gryffindorPoints - ravenclawPoints) >= 300) {
      System.out.println("Gryffindor win the championship!");
    } else if (gryffindorPoints >= ravenclawPoints) {
      System.out.println("Gryffindor came second!");
    } else if ((ravenclawPoints - gryffindorPoints) <= 100) {
      System.out.println("Gryffindor came third!");
    } else {
      System.out.println("Gryffindor came fourth!");
    }
  }
}
