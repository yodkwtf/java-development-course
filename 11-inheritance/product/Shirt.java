package product;

public class Shirt extends Product {
    private Size size;

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
