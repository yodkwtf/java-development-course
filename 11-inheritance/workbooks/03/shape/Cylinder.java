package shape;

public class Cylinder extends Shape {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = 2 * Math.PI * getRadius() * (getRadius() + height);
        return area;
    }

    @Override
    public double getVolume() {
        double volume = Math.PI * Math.pow(getRadius(), 2) * height;
        return volume;
    }
}
