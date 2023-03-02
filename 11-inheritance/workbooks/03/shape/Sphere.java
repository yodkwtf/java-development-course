package shape;

public class Sphere extends Shape {
  public Sphere(double radius) {
    super(radius);
  }

  @Override
  public double getArea() {
    double area = 4 * Math.PI * Math.pow(getRadius(), 2);
    return area;
  }

  @Override
  public double getVolume() {
    double volume = (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    return volume;
  }
}