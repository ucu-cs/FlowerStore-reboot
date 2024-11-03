
package flower.store;

import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final Payment paymentType;

    public PaymentController() {
        this.paymentType = new PayPalPaymentStrategy();
    }

    @GetMapping("/payment")
    public String getPaymentInfo() {
        double amount = new Random().nextDouble() * 10000;
        return paymentType.pay(amount);
    }
}
