import product.Pants;
import product.Shirt;
import product.Shirt.Size;

public class Main {
    public static void main(String[] args) {
        // # SHIRT
        Shirt shirt = new Shirt();
        // methods inherited from Shirt (child) class
        shirt.setSize(Size.SMALL);
        // methods inherited from Product (parent) class
        shirt.setColor("Black");
        shirt.setBrand("Adidas");
        shirt.setPrice(100.0);
        shirt.fold();

        // # PANTS
        Pants pants = new Pants();
        // methods inherited from Pants (child) class
        pants.setWaist(32);
        pants.setLength(32);
        // methods inherited from Product (parent) class
        pants.setColor("Navy Blue");
        pants.setBrand("Nike");
        pants.setPrice(120.0);
        pants.fold();
    }
}
