package patterns.facade;

import java.util.List;

public interface OrderService {

    Order createNewOrder(Customer customer, List<Product> products) throws NotEnoughProducts;

    boolean cancelOrder(long orderId);
}
