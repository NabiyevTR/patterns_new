package patterns.mvc.model.repository;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FakeProductRepository implements ProductRepository {

    private final Map<Integer, Product> productRepository = new HashMap<>();

    {
        Product apple = Product.builder()
                .name("apple")
                .cost(2.0)
                .build();

        Product orange = Product.builder()
                .name("orange")
                .cost(4.0)
                .build();

        Product banana = Product.builder()
                .name("banana")
                .cost(2.0)
                .build();

        productRepository.put(1, apple);
        productRepository.put(2, orange);
        productRepository.put(3, banana);
    }

    @Override
    public Product getById(int id) {
        return productRepository.get(id);
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<Product>(productRepository.values());
    }
}
