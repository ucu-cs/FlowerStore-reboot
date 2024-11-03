package flower.store;

import java.util.List;

public interface Delivery {
    String deliver(List<Flower> flowers);
    Order getOrder();
    void setOrder(Order order);
    String getAddress();
    void setAddress(String address);
    String getdelivery();
}
