package flower.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class DeliveryController {
    private final Delivery deliveryStrategy;

    public DeliveryController() {
        this.deliveryStrategy = new PostDeliveryStrategy();
    }

    @GetMapping("/delivery")
    public String getDeliveryInfo() {
        return deliveryStrategy.deliver(Arrays.asList(new Flower(), new Flower(), new Flower()));
    }
}
