package flower.store;
public class PayPalPaymentStrategy implements Payment {
    @Override
    public String pay(double price) {
        return String.format("Paid %.2f with credit card", price);
    }
}
