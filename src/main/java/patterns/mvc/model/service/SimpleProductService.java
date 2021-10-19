package patterns.mvc.model.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import patterns.mvc.model.repository.Product;
import patterns.mvc.model.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SimpleProductService implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product getById(int id) {
        return productRepository.getById(id);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }
}
