package patterns.factory.creator;

import patterns.factory.exceptions.NoSuchTacoException;
import patterns.factory.product.Taco;

public abstract class TacoStore {

   public Taco orderTaco(String tacoName) throws NoSuchTacoException {
        Taco taco = createTaco(tacoName);
        taco.prepare();
        taco.box();
        return taco;
    }

    public abstract Taco createTaco(String tacoName) throws NoSuchTacoException;
}
