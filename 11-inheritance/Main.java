import product.Pants;
import product.Product;
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
        productStore(shirt);

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
        productStore(pants);
    }

    // public static void pantStore(Pants pants) {
    // System.out.println("Thank your for purchasing " + pants.getBrand() + "
    // pants!");
    // }

    // public static void shirtStore(Shirt shirt) {
    // System.out.println("Thank your for purchasing " + shirt.getBrand() + "
    // shirt!");
    // }

    public static void productStore(Product product) {
        System.out.println(
                "Thank your for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName() + "!");
    }
}
