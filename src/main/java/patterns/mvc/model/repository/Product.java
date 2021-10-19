package patterns.mvc.model.repository;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Product {
    private String name;
    private double cost;
}
