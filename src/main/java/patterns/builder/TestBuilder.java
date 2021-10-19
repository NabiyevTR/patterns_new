package patterns.builder;

import java.util.Arrays;
import java.util.List;

public class TestBuilder {

    public static void main(String[] args) {

        Product product_1 = (new ProductBuilder())
                .id(1)
                .name("Apple")
                .cost(1.0)
                .build();

        Product product_2 = (new ProductBuilder())
                .id(2)
                .name("Banana")
                .cost(2.0)
                .build();

        Product product_3 = (new ProductBuilder())
                .id(3)
                .name("Fig")
                .cost(3.0)
                .build();

        List products = Arrays.asList(product_1, product_2, product_3);

        Order order = (new OrderBuilder())
                .id(1)
                .addProducts(products)
                .build();

        System.out.println(order);

    }
}
