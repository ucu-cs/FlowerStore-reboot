package flower.store;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Order {
    private List<Item> items;
    private Delivery delivery;
    private Payment payment;

    public Order(List<Item> items) {
        this.items = items;
        payment = new PayPalPaymentStrategy();
        delivery = new PostDeliveryStrategy();
    }
    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }
    public void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }
    public double getTotalPrice(){
        double total = 0;
        for (Item item : items){
            total += item.getPrice();
        }
        return total;
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
}
