import java.util.Arrays;
import java.util.List;

public class StreamOperations {
  public static void main(String[] args) {
    List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

    // break data source into a stream of elements
    prices.stream()
        /**
         * - FILTER OPERATION (relies on Predicate)
         * receives a stream of elements and returns a filtered stream of elements
         */
        .filter(price -> {
          return price > 100;
        })

        /**
         * - MAP OPERATION (relies on Function)
         * transforms each element in the stream
         * 
         */
        .map(price -> {
          return price * 0.9;
        })

        /**
         * - SORTED OPERATION (relies on Comparator)
         * receives a stream of elements and returns a sorted stream of elements
         * 
         */
        .sorted((price1, price2) -> {
          return price1.compareTo(price2);
        })

        .map(price -> {
          return "$" + price;
        })

        /**
         * - ForEach OPERATION (relies on Consumer)
         * receives a stream and produces an output
         * `Terminal Operation`: it is the last operation in the stream
         */
        .forEach(price -> {
          System.out.println(price);
        });

    // # Simpler Form
    // prices.stream()
    // .filter(price -> price > 100)
    // .map(price -> price * 0.9)
    // .sorted((price1, price2) -> price1.compareTo(price2))
    // .map(price -> "$" + price)
    // .forEach(price -> System.out.println(price));
  }
}