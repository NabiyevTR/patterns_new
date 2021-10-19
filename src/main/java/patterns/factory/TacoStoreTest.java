package patterns.factory;

import patterns.factory.creator.MexicoTacoStore;
import patterns.factory.creator.TacoStore;

public class TacoStoreTest {

    public static void main(String[] args) {

        TacoStore mexicoTacoStore = new MexicoTacoStore();
        try {
            mexicoTacoStore.orderTaco("barbacoa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
