package patterns.facade;

import lombok.Getter;

import java.util.*;


public class OrderServiceFullLibImpl implements OrderServiceFullLib {

    private final Customer customer;
    private final List<Product> products;

    private final Map<Product, Integer> productMap;

    public OrderServiceFullLibImpl(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.productMap = new HashMap<>();
        convertProductListToHashMap();

    }

    private void convertProductListToHashMap() {
        for (Product product : products) {
            productMap.put(product, productMap.getOrDefault(product, 0) + 1);
        }
    }

    @Override
    public Order createNewOrder() {
        Order order = new Order();
        order.setCustomerId(customer.getId());
        order.setDiscount(getDiscount());
        order.setProductMap(getProductMap());
        order.setDeliveryDate(determineDeliveryDate());
        saveToDb();
        return order;
    }

    @Override
    public Map<Product, Integer> getProductMap() {
        return getProductMap();
    }

    @Override
    public double getTotal() {
        return products.stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);
    }

    @Override
    public double getTotalWithDiscount() {
        return getTotal() * getDiscount();
    }

    @Override
    public boolean checkAvailability() {
        for (int requiredAmount : productMap.values()) {
            if (requiredAmount > 5) return false;
        }
        return true;
    }

    @Override
    public double getDiscount() {
        double total = getTotal();
        if (total > 100) {
            return 0.8;
        } else if (total > 80) {
            return 0.9;
        } else {
            return 1.0;
        }
    }

    @Override
    public Date determineDeliveryDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, 2);
        return calendar.getTime();
    }

    @Override
    public void saveToDb() {
        System.out.println("Saving order to db");
    }
}
