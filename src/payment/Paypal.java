package payment;

public class Paypal implements PaymentProcessor {

//TODO реализовать метод “makePayment”, который принимает цену с типом Integer,
// который выкидывает Exception, если цена > 100000 и ничего не возвращает.
    private void makePayment(Integer price) throws Exception {
        if (price > 100000) {
            throw new Exception("Price exceeds the Paypal limit.");
        }
    }

    @Override
    public boolean payWithProcessor(double price) throws Exception {
        //TODO
        makePayment((int) price);
        return true;
    }

    @Override
    public String name() {
        return "paypal";
    }
}
