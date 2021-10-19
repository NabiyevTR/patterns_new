package patterns.facade;

import java.util.Date;

import java.util.Map;

public interface OrderServiceFullLib {

    Map<Product, Integer> getProductMap();

    double getTotal();

    double getTotalWithDiscount();

    boolean checkAvailability();

    double getDiscount();

    Date determineDeliveryDate();

    void saveToDb();

    Order createNewOrder();
}
