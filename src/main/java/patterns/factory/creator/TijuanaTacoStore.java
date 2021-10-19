package patterns.factory.creator;

import patterns.factory.exceptions.NoSuchTacoException;
import patterns.factory.product.*;

public class TijuanaTacoStore extends TacoStore {

    @Override
    public Taco createTaco(String tacoName) throws NoSuchTacoException {
        if (tacoName.equals("taco al pastor")) {
            return new TacoAlPastor();
        } else if (tacoName.equals("taco de birria")) {
            return new TacoDeBirria();
        } else if (tacoName.equals("taco de pescado")) {
            return new TacoDePescado();
        } else if (tacoName.equals("tingo taco")) {
            return new TingoTaco();
        } else {
            throw new NoSuchTacoException();
        }
    }

}
