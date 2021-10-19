package patterns.builder;

import java.util.Arrays;
import java.util.Collection;

public class OrderBuilder {
    private final Order order;

    public OrderBuilder() {
        this.order = new Order();
    }

    public OrderBuilder addProduct(Product product) {
        order.getOrderedProducts().add(product);
        return this;
    }

    public OrderBuilder addProducts(Product ...products) {
        order.getOrderedProducts().addAll(Arrays.asList(products));
        return this;
    }

    public OrderBuilder addProducts(Collection<Product> products) {
        order.getOrderedProducts().addAll(products);
        return this;
    }

    public OrderBuilder id(long id) {
        order.setId(id);
        return this;
    }

    public Order build() {
        return order;
    }
}
