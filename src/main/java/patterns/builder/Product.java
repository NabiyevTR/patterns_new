package patterns.builder;

import lombok.Data;

@Data
public class Product {
    private long id;
    private String name;
    private double cost;

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }
}
