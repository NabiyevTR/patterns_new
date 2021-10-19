package patterns.facade;


import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class Order {
    private long customerId;
    private Map<Product, Integer> productMap;
    private double discount;
    private Date deliveryDate;

}
