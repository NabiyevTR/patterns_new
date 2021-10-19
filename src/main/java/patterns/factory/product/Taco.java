package patterns.factory.product;

import lombok.Getter;

public abstract class Taco {

    @Getter
    String name;

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void box() {
        System.out.println("Boxing taco.");
    }

}
