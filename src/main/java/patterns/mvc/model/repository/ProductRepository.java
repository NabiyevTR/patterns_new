package patterns.mvc.model.repository;

import java.util.List;

public interface ProductRepository {

    Product getById(int id);

    List<Product> getAll();

}
