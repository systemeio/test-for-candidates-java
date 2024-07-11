package payment;

public class PaypalPaymentProcessor {

    public void makePayment(Integer price) throws Exception {
        if (price > 100000) {
            throw new Exception("Price exceeds the Paypal limit.");
        }
    }
}
