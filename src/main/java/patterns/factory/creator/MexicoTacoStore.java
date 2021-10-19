package patterns.factory.creator;

import patterns.factory.exceptions.NoSuchTacoException;
import patterns.factory.product.Barbacoa;
import patterns.factory.product.Campechanos;
import patterns.factory.product.ShrimpTaco;
import patterns.factory.product.Taco;

public class MexicoTacoStore extends TacoStore{

    @Override
    public Taco createTaco(String tacoName) throws NoSuchTacoException {
        if (tacoName.equals("barbacoa")) {
            return new Barbacoa();
        } else if (tacoName.equals("campechanos")) {
            return new Campechanos();
        } else if (tacoName.equals("shrimp taco")) {
            return new ShrimpTaco();
        } else {
            throw new NoSuchTacoException();
        }
    }
}
