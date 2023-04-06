package patterns.builder;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Order {
    private long id;
    private List<Product> orderedProducts = new ArrayList<>();

    public String getBill() {
        StringBuilder sb = new StringBuilder();
        sb.append("======================\n");
        sb.append("=== Village market ===\n");
        sb.append("======================\n\n");
        orderedProducts.forEach(p ->
                sb.append(" " + p.getName() + "\t\t\t" + p.getCost() + "\n")
        );
        sb.append("\n======================\n");
        sb
                .append(" Total:\t\t\t")
                .append(
                        orderedProducts.stream()
                                .map(Product::getCost)
                                .reduce(0.0, Double::sum)
       );
        return sb.toString();
    }


    public static OrderBuilder builder() {
        return new OrderBuilder();
    }
}
