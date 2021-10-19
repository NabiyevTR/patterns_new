package patterns.mvc.model.service;

import patterns.mvc.model.repository.Product;

import java.util.List;

public interface ProductService {

    Product getById(int id);

    List<Product> getAll();

}
