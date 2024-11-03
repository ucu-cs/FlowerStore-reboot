package flower.store;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    private String adress;
    private  Order order;
    @Override
    public String deliver(List<Flower> flowers) {
        return "Flowers delivered via DHL: " + flowers.size() + " items.";
    }
    
    @Override
    public Order getOrder() {
        return order;
    }

    @Override
    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String getAddress() {
        return this.adress;
    }

    @Override
    public void setAddress(String address) {
        this.adress = address;
    }

    @Override
    public String getdelivery() {
        return "DHL Delivery";
    }
    
}
