package patterns.facade;

import java.util.List;


public class OrderServiceImpl implements OrderService {

    private final OrderServiceFullLib orderServiceFullLib;
    private final Customer customer;
    private final List<Product> products;

    public OrderServiceImpl(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        orderServiceFullLib = new OrderServiceFullLibImpl(this.customer, this.products);
    }

    @Override
    public Order createNewOrder(Customer customer, List<Product> products) throws NotEnoughProducts {

        if (!orderServiceFullLib.checkAvailability()) throw new NotEnoughProducts();

        return orderServiceFullLib.createNewOrder();
     
    }

    @Override
    public boolean cancelOrder(long orderId) {
        throw new UnsupportedOperationException("Develop in progress!");
    }
}
