public class BuiltInFunctions {
  public static void main(String[] args) {

    double sine = Math.sin(1.2);
    System.out.println("sine: " + sine); // 0.9320390859672264

    double power = calcPower(2, 4);
    System.out.println("power: " + power); // 16.0
  }

  public static double calcPower(double base, double exponent) {
    return Math.pow(base, exponent);
  }
}
