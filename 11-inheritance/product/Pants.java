package product;

public class Pants extends Product {

    private int waist;
    private int length;

    // Constructor
    public Pants(double price, String color, String brand, int waist, int length) {
        super(price, color, brand);
        this.waist = waist;
        this.length = length;
    }

    // Getters and Setters
    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Methods
    @Override
    public void fold() {
        super.fold();
        System.out.println("Hold pants by waist");
        System.out.println("Fold pants in half");
        System.out.println("Fold pants from bottom to top");
        System.out.println("Fold pants in half\n");
    }
}
