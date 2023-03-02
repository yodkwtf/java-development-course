import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;

public class Main {
    public static void main(String[] args) {
        // # SHIRT
        Shirt shirt = new Shirt(100.0, "Black", "Adidas", Size.SMALL);
        shirt.fold();
        productStore(shirt);

        // # PANTS
        Pants pants = new Pants(120.0, "Navy Blue", "Nike", 32, 56);
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
        product.wear();
    }
}
