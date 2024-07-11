package payment;

public class Paypal implements PaymentProcessor {

    private void makePayment(Integer price) throws Exception {
        if (price > 100000) {
            throw new Exception("Price exceeds the Paypal limit.");
        }
    }

    @Override
    public boolean payWithProcessor(double price) throws Exception {
        makePayment((int) price);
        return true;
    }

    @Override
    public String name() {
        return "paypal";
    }
}
