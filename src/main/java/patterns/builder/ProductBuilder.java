package patterns.builder;


public class ProductBuilder {
    private final Product product;

    public ProductBuilder() {
        this.product = new Product();
    }

    public ProductBuilder id(long id) {
        product.setId(id);
        return this;
    }

    public ProductBuilder name(String name) {
        product.setName(name);
        return this;
    }

    public ProductBuilder cost(Double cost) {
        product.setCost(cost);
        return this;
    }

    public Product build() {
        return product;
    }
}
