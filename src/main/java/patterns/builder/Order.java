package patterns.builder;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Order {
    private long id;
    private List<Product> orderedProducts = new ArrayList<>();

    public double getTotal() {
       return orderedProducts.stream()
                .map(Product::getCost)
                .reduce(0.0, Double::sum);
    }
}
