package flower.store;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public String pay(double price) {
        return String.format("Paid %.2f with credit card", price);
    }
}
